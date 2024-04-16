package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.124Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference")
public class MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBurnRate(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRate>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRate> __cast_cd4240 = (java.util.List<com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRate>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRate __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putBurnRate", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBurnRate() {
        software.amazon.jsii.Kernel.call(this, "resetBurnRate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBurnRateThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetBurnRateThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateList getBurnRate() {
        return software.amazon.jsii.Kernel.get(this, "burnRate", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalBurnRateList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBurnRateInput() {
        return software.amazon.jsii.Kernel.get(this, "burnRateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBurnRateThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "burnRateThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "timeRangeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBurnRateThreshold() {
        return software.amazon.jsii.Kernel.get(this, "burnRateThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBurnRateThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "burnRateThreshold", java.util.Objects.requireNonNull(value, "burnRateThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeRange(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeRange", java.util.Objects.requireNonNull(value, "timeRange is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCritical getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCritical.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCritical value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
