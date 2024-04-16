package com.sumologic.cse_aggregation_rule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.621Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseAggregationRule.CseAggregationRuleSeverityMappingOutputReference")
public class CseAggregationRuleSeverityMappingOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CseAggregationRuleSeverityMappingOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseAggregationRuleSeverityMappingOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CseAggregationRuleSeverityMappingOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMapping(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingMapping>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingMapping> __cast_cd4240 = (java.util.List<com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingMapping>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingMapping __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putMapping", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDefault() {
        software.amazon.jsii.Kernel.call(this, "resetDefault", software.amazon.jsii.NativeType.VOID);
    }

    public void resetField() {
        software.amazon.jsii.Kernel.call(this, "resetField", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMapping() {
        software.amazon.jsii.Kernel.call(this, "resetMapping", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingMappingList getMapping() {
        return software.amazon.jsii.Kernel.get(this, "mapping", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMappingMappingList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDefaultInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFieldInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getMappingInput() {
        return software.amazon.jsii.Kernel.get(this, "mappingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultValue() {
        return software.amazon.jsii.Kernel.get(this, "default", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDefaultValue(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "default", java.util.Objects.requireNonNull(value, "default is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getField() {
        return software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setField(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "field", java.util.Objects.requireNonNull(value, "field is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.cse_aggregation_rule.CseAggregationRuleSeverityMapping value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
