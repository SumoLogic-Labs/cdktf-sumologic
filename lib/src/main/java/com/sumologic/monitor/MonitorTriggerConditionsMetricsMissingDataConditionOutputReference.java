package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.121Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataConditionOutputReference")
public class MonitorTriggerConditionsMetricsMissingDataConditionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsMetricsMissingDataConditionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsMetricsMissingDataConditionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsMetricsMissingDataConditionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "timeRangeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTriggerSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerSourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeRange(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeRange", java.util.Objects.requireNonNull(value, "timeRange is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTriggerSource() {
        return software.amazon.jsii.Kernel.get(this, "triggerSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTriggerSource(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "triggerSource", java.util.Objects.requireNonNull(value, "triggerSource is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
