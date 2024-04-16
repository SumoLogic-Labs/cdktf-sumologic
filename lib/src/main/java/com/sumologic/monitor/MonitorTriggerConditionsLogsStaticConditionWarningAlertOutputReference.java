package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.120Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlertOutputReference")
public class MonitorTriggerConditionsLogsStaticConditionWarningAlertOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsLogsStaticConditionWarningAlertOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsLogsStaticConditionWarningAlertOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsLogsStaticConditionWarningAlertOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThresholdType() {
        software.amazon.jsii.Kernel.call(this, "resetThresholdType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThresholdTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getThreshold() {
        return software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "threshold", java.util.Objects.requireNonNull(value, "threshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getThresholdType() {
        return software.amazon.jsii.Kernel.get(this, "thresholdType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThresholdType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thresholdType", java.util.Objects.requireNonNull(value, "thresholdType is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
