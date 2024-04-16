package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.121Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionOutputReference")
public class MonitorTriggerConditionsMetricsOutlierConditionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsMetricsOutlierConditionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsMetricsOutlierConditionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsMetricsOutlierConditionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCritical(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionCritical value) {
        software.amazon.jsii.Kernel.call(this, "putCritical", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWarning(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarning value) {
        software.amazon.jsii.Kernel.call(this, "putWarning", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCritical() {
        software.amazon.jsii.Kernel.call(this, "resetCritical", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDirection() {
        software.amazon.jsii.Kernel.call(this, "resetDirection", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWarning() {
        software.amazon.jsii.Kernel.call(this, "resetWarning", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionCriticalOutputReference getCritical() {
        return software.amazon.jsii.Kernel.get(this, "critical", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionCriticalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarningOutputReference getWarning() {
        return software.amazon.jsii.Kernel.get(this, "warning", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarningOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionCritical getCriticalInput() {
        return software.amazon.jsii.Kernel.get(this, "criticalInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionCritical.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDirectionInput() {
        return software.amazon.jsii.Kernel.get(this, "directionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarning getWarningInput() {
        return software.amazon.jsii.Kernel.get(this, "warningInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionWarning.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirection() {
        return software.amazon.jsii.Kernel.get(this, "direction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDirection(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "direction", java.util.Objects.requireNonNull(value, "direction is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
