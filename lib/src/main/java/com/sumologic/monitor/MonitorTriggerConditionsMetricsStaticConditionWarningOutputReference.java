package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.123Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningOutputReference")
public class MonitorTriggerConditionsMetricsStaticConditionWarningOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsMetricsStaticConditionWarningOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsMetricsStaticConditionWarningOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsMetricsStaticConditionWarningOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAlert(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningAlert value) {
        software.amazon.jsii.Kernel.call(this, "putAlert", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putResolution(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningResolution value) {
        software.amazon.jsii.Kernel.call(this, "putResolution", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningAlertOutputReference getAlert() {
        return software.amazon.jsii.Kernel.get(this, "alert", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningAlertOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningResolutionOutputReference getResolution() {
        return software.amazon.jsii.Kernel.get(this, "resolution", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningResolutionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningAlert getAlertInput() {
        return software.amazon.jsii.Kernel.get(this, "alertInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningAlert.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOccurrenceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "occurrenceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningResolution getResolutionInput() {
        return software.amazon.jsii.Kernel.get(this, "resolutionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarningResolution.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "timeRangeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOccurrenceType() {
        return software.amazon.jsii.Kernel.get(this, "occurrenceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOccurrenceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "occurrenceType", java.util.Objects.requireNonNull(value, "occurrenceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeRange(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeRange", java.util.Objects.requireNonNull(value, "timeRange is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarning getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarning.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionWarning value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
