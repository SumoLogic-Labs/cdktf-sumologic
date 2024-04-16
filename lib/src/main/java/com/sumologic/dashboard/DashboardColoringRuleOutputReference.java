package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.817Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardColoringRuleOutputReference")
public class DashboardColoringRuleOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardColoringRuleOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardColoringRuleOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DashboardColoringRuleOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putColorThreshold(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.dashboard.DashboardColoringRuleColorThreshold>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.dashboard.DashboardColoringRuleColorThreshold> __cast_cd4240 = (java.util.List<com.sumologic.dashboard.DashboardColoringRuleColorThreshold>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.dashboard.DashboardColoringRuleColorThreshold __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putColorThreshold", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetColorThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetColorThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardColoringRuleColorThresholdList getColorThreshold() {
        return software.amazon.jsii.Kernel.get(this, "colorThreshold", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardColoringRuleColorThresholdList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getColorThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "colorThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMultipleSeriesAggregateFunctionInput() {
        return software.amazon.jsii.Kernel.get(this, "multipleSeriesAggregateFunctionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScopeInput() {
        return software.amazon.jsii.Kernel.get(this, "scopeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSingleSeriesAggregateFunctionInput() {
        return software.amazon.jsii.Kernel.get(this, "singleSeriesAggregateFunctionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMultipleSeriesAggregateFunction() {
        return software.amazon.jsii.Kernel.get(this, "multipleSeriesAggregateFunction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMultipleSeriesAggregateFunction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "multipleSeriesAggregateFunction", java.util.Objects.requireNonNull(value, "multipleSeriesAggregateFunction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScope() {
        return software.amazon.jsii.Kernel.get(this, "scope", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScope(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scope", java.util.Objects.requireNonNull(value, "scope is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSingleSeriesAggregateFunction() {
        return software.amazon.jsii.Kernel.get(this, "singleSeriesAggregateFunction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSingleSeriesAggregateFunction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "singleSeriesAggregateFunction", java.util.Objects.requireNonNull(value, "singleSeriesAggregateFunction is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardColoringRule value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
