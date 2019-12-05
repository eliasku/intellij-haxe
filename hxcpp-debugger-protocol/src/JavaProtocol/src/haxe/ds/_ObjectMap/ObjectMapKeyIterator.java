// Generated by Haxe 4.0.0-preview.5+7eb789f54
package haxe.ds._ObjectMap;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class ObjectMapKeyIterator<T, V> extends haxe.lang.HxObject
{
	public ObjectMapKeyIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ObjectMapKeyIterator(haxe.ds.ObjectMap<T, V> m)
	{
		//line 497 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		haxe.ds._ObjectMap.ObjectMapKeyIterator.__hx_ctor_haxe_ds__ObjectMap_ObjectMapKeyIterator(((haxe.ds._ObjectMap.ObjectMapKeyIterator<T, V>) (this) ), ((haxe.ds.ObjectMap<T, V>) (m) ));
	}
	
	
	protected static <T_c, V_c> void __hx_ctor_haxe_ds__ObjectMap_ObjectMapKeyIterator(haxe.ds._ObjectMap.ObjectMapKeyIterator<T_c, V_c> __hx_this, haxe.ds.ObjectMap<T_c, V_c> m)
	{
		//line 498 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		__hx_this.i = 0;
		//line 499 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		__hx_this.m = m;
		//line 500 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		__hx_this.len = m.nBuckets;
	}
	
	
	public haxe.ds.ObjectMap<T, V> m;
	
	public int i;
	
	public int len;
	
	public final boolean hasNext()
	{
		//line 504 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 504 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			int _g = this.i;
			//line 504 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			int _g1 = this.len;
			//line 504 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			while (( _g < _g1 ))
			{
				//line 504 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				int j = _g++;
				//line 506 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				if (( (( this.m.hashes[j] & -2 )) != 0 )) 
				{
					//line 508 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					this.i = j;
					//line 509 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 512 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		return false;
	}
	
	
	public final T next()
	{
		//line 516 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		T ret = this.m._keys[this.i];
		//line 519 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		this.m.cachedIndex = this.i;
		//line 520 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		this.m.cachedKey = ret;
		//line 523 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		this.i += 1;
		//line 524 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		return ret;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			switch (field.hashCode())
			{
				case 107029:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("len")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						this.len = ((int) (value) );
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return value;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 105:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("i")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						this.i = ((int) (value) );
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return value;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			switch (field.hashCode())
			{
				case 107029:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("len")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						this.len = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return value;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 109:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("m")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						this.m = ((haxe.ds.ObjectMap<T, V>) (value) );
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return value;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 105:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("i")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						this.i = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return value;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("next")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 109:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("m")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return this.m;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("hasNext")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 105:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("i")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return this.i;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 107029:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("len")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return this.len;
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			switch (field.hashCode())
			{
				case 107029:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("len")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return ((double) (this.len) );
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 105:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("i")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return ((double) (this.i) );
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("next")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return this.next();
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					if (field.equals("hasNext")) 
					{
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						__temp_executeDef1 = false;
						//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						return this.hasNext();
					}
					
					//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					break;
				}
				
				
			}
			
			//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		baseArr.push("len");
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		baseArr.push("i");
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		baseArr.push("m");
		//line 492 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

