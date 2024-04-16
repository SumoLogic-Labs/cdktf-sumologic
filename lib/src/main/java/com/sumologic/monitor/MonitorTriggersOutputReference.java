package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.127Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggersOutputReference")
public class MonitorTriggersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MonitorTriggersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MonitorTriggersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public MonitorTriggersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void resetDetectionMethod() {
        software.amazon.jsii.Kernel.call(this, "resetDetectionMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMinDataPoints() {
        software.amazon.jsii.Kernel.call(this, "resetMinDataPoints", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOccurrenceType() {
        software.amazon.jsii.Kernel.call(this, "resetOccurrenceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResolutionWindow() {
        software.amazon.jsii.Kernel.call(this, "resetResolutionWindow", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThresholdType() {
        software.amazon.jsii.Kernel.call(this, "resetThresholdType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTriggerSource() {
        software.amazon.jsii.Kernel.call(this, "resetTriggerSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTriggerType() {
        software.amazon.jsii.Kernel.call(this, "resetTriggerType", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDetectionMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "detectionMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMinDataPointsInput() {
        return software.amazon.jsii.Kernel.get(this, "minDataPointsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getOccurrenceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "occurrenceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResolutionWindowInput() {
        return software.amazon.jsii.Kernel.get(this, "resolutionWindowInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThresholdTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "timeRangeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTriggerSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerSourceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTriggerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "triggerTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDetectionMethod() {
        return software.amazon.jsii.Kernel.get(this, "detectionMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDetectionMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "detectionMethod", java.util.Objects.requireNonNull(value, "detectionMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMinDataPoints() {
        return software.amazon.jsii.Kernel.get(this, "minDataPoints", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMinDataPoints(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "minDataPoints", java.util.Objects.requireNonNull(value, "minDataPoints is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOccurrenceType() {
        return software.amazon.jsii.Kernel.get(this, "occurrenceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setOccurrenceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "occurrenceType", java.util.Objects.requireNonNull(value, "occurrenceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResolutionWindow() {
        return software.amazon.jsii.Kernel.get(this, "resolutionWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResolutionWindow(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resolutionWindow", java.util.Objects.requireNonNull(value, "resolutionWindow is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTriggerType() {
        return software.amazon.jsii.Kernel.get(this, "triggerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTriggerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "triggerType", java.util.Objects.requireNonNull(value, "triggerType is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggers value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
