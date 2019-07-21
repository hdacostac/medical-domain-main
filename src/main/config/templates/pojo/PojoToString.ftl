<#if pojo.needsToString()>    /**
     * toString
     * @return String
     */
     @Override
     public String toString() {
	  StringBuilder buffer = new StringBuilder();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
<#foreach property in pojo.getToStringPropertiesIterator()>      buffer.append("${property.getName()}").append("='").append(${pojo.getGetterSignature(property)}()).append("' ");			
</#foreach>      buffer.append("]");
      
      return buffer.toString();
     }
</#if>