package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.123Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsOutputReference")
public class MonitorTriggerConditionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggerConditionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggerConditionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MonitorTriggerConditionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putLogsMissingDataCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition value) {
        software.amazon.jsii.Kernel.call(this, "putLogsMissingDataCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogsOutlierCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition value) {
        software.amazon.jsii.Kernel.call(this, "putLogsOutlierCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogsStaticCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition value) {
        software.amazon.jsii.Kernel.call(this, "putLogsStaticCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetricsMissingDataCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition value) {
        software.amazon.jsii.Kernel.call(this, "putMetricsMissingDataCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetricsOutlierCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition value) {
        software.amazon.jsii.Kernel.call(this, "putMetricsOutlierCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetricsStaticCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition value) {
        software.amazon.jsii.Kernel.call(this, "putMetricsStaticCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSloBurnRateCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition value) {
        software.amazon.jsii.Kernel.call(this, "putSloBurnRateCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSloSliCondition(final @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition value) {
        software.amazon.jsii.Kernel.call(this, "putSloSliCondition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetLogsMissingDataCondition() {
        software.amazon.jsii.Kernel.call(this, "resetLogsMissingDataCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogsOutlierCondition() {
        software.amazon.jsii.Kernel.call(this, "resetLogsOutlierCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogsStaticCondition() {
        software.amazon.jsii.Kernel.call(this, "resetLogsStaticCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricsMissingDataCondition() {
        software.amazon.jsii.Kernel.call(this, "resetMetricsMissingDataCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricsOutlierCondition() {
        software.amazon.jsii.Kernel.call(this, "resetMetricsOutlierCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetricsStaticCondition() {
        software.amazon.jsii.Kernel.call(this, "resetMetricsStaticCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSloBurnRateCondition() {
        software.amazon.jsii.Kernel.call(this, "resetSloBurnRateCondition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSloSliCondition() {
        software.amazon.jsii.Kernel.call(this, "resetSloSliCondition", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataConditionOutputReference getLogsMissingDataCondition() {
        return software.amazon.jsii.Kernel.get(this, "logsMissingDataCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionOutputReference getLogsOutlierCondition() {
        return software.amazon.jsii.Kernel.get(this, "logsOutlierCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionOutputReference getLogsStaticCondition() {
        return software.amazon.jsii.Kernel.get(this, "logsStaticCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataConditionOutputReference getMetricsMissingDataCondition() {
        return software.amazon.jsii.Kernel.get(this, "metricsMissingDataCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionOutputReference getMetricsOutlierCondition() {
        return software.amazon.jsii.Kernel.get(this, "metricsOutlierCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionOutputReference getMetricsStaticCondition() {
        return software.amazon.jsii.Kernel.get(this, "metricsStaticCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionOutputReference getSloBurnRateCondition() {
        return software.amazon.jsii.Kernel.get(this, "sloBurnRateCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionOutputReference getSloSliCondition() {
        return software.amazon.jsii.Kernel.get(this, "sloSliCondition", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition getLogsMissingDataConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "logsMissingDataConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsMissingDataCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition getLogsOutlierConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "logsOutlierConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition getLogsStaticConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "logsStaticConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition getMetricsMissingDataConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "metricsMissingDataConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsMissingDataCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition getMetricsOutlierConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "metricsOutlierConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsOutlierCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition getMetricsStaticConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "metricsStaticConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsMetricsStaticCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition getSloBurnRateConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "sloBurnRateConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloBurnRateCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition getSloSliConditionInput() {
        return software.amazon.jsii.Kernel.get(this, "sloSliConditionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloSliCondition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
