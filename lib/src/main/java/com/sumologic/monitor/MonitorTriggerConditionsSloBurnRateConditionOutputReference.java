package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.125Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionOutputReference")
public class MonitorTriggerConditionsSloBurnRateConditionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsSloBurnRateConditionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsSloBurnRateConditionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsSloBurnRateConditionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCritical(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCritical value) {
        software.amazon.jsii.Kernel.call(this, "putCritical", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWarning(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarning value) {
        software.amazon.jsii.Kernel.call(this, "putWarning", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCritical() {
        software.amazon.jsii.Kernel.call(this, "resetCritical", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWarning() {
        software.amazon.jsii.Kernel.call(this, "resetWarning", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference getCritical() {
        return software.amazon.jsii.Kernel.get(this, "critical", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCriticalOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarningOutputReference getWarning() {
        return software.amazon.jsii.Kernel.get(this, "warning", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarningOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCritical getCriticalInput() {
        return software.amazon.jsii.Kernel.get(this, "criticalInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionCritical.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarning getWarningInput() {
        return software.amazon.jsii.Kernel.get(this, "warningInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionWarning.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
