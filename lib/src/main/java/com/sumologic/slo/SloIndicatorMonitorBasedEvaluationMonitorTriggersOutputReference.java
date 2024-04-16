package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.209Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference")
public class SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMonitorIdInput() {
        return software.amazon.jsii.Kernel.get(this, "monitorIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTriggerTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "triggerTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMonitorId() {
        return software.amazon.jsii.Kernel.get(this, "monitorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMonitorId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "monitorId", java.util.Objects.requireNonNull(value, "monitorId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTriggerTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "triggerTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTriggerTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "triggerTypes", java.util.Objects.requireNonNull(value, "triggerTypes is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
