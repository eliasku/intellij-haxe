/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2014 AS3Boyan
 * Copyright 2014-2014 Elias Ku
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.plugins.haxe.ide.hierarchy.call;

import com.intellij.ide.hierarchy.CallHierarchyBrowserBase;
import com.intellij.ide.hierarchy.HierarchyBrowser;
import com.intellij.ide.hierarchy.HierarchyProvider;
import com.intellij.ide.hierarchy.call.CallHierarchyBrowser;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.plugins.haxe.ide.hierarchy.HaxeHierarchyUtils;
import com.intellij.plugins.haxe.lang.psi.HaxeMethod;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import org.apache.log4j.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by ebishton on 9/3/14.
 */
public class HaxeCallHierarchyProvider implements HierarchyProvider {
  private static final Logger LOG = Logger.getInstance("#com.intellij.ide.hierarchy.type.HaxeCallHierarchyProvider");

  static {
    LOG.info("Loaded HaxeCallHierarchyProvider");
    LOG.setLevel(Level.DEBUG);
  }

  /**
   * Returns the element for which the hierarchy should be displayed.
   *
   * @param context the data context for the action invocation.
   * @return the target element, or null if the action is not applicable in this context.
   */
  @Nullable
  @Override
  public PsiElement getTarget(@NotNull DataContext context) {
    if ( LOG.isDebugEnabled() ) {
      LOG.debug( "getTarget " + context );
    }

    HaxeMethod foundMethod = HaxeHierarchyUtils.getTargetMethod(context);
    return foundMethod;
  }

  /**
   * Creates a browser for viewing the hierarchy of the specified element.
   *
   * @param element the element to view the hierarchy for.
   * @return the browser instance.
   */
  @NotNull
  @Override
  public HierarchyBrowser createHierarchyBrowser(PsiElement element) {
    if ( LOG.isDebugEnabled() ) {
      LOG.debug( "createHierarchyBrowser " + element );
    }
    return new HaxeCallHierarchyBrowser(element.getProject(), (PsiMethod) element);
  }

  /**
   * Notifies that the toolwindow has been shown and the specified browser is currently being displayed.
   *
   * @param hierarchyBrowser the browser instance created by {@link #createHierarchyBrowser(com.intellij.psi.PsiElement)}.
   */
  @Override
  public void browserActivated(@NotNull HierarchyBrowser hierarchyBrowser) {
    if ( LOG.isDebugEnabled() ) {
      LOG.debug( "browserActivated " + hierarchyBrowser );
    }

    ((CallHierarchyBrowser) hierarchyBrowser).changeView(CallHierarchyBrowserBase.CALLER_TYPE);
  }
}
