package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.209Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorMonitorBasedEvaluationOutputReference")
public class SloIndicatorMonitorBasedEvaluationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SloIndicatorMonitorBasedEvaluationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SloIndicatorMonitorBasedEvaluationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SloIndicatorMonitorBasedEvaluationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putMonitorTriggers(final @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers value) {
        software.amazon.jsii.Kernel.call(this, "putMonitorTriggers", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference getMonitorTriggers() {
        return software.amazon.jsii.Kernel.get(this, "monitorTriggers", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggersOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers getMonitorTriggersInput() {
        return software.amazon.jsii.Kernel.get(this, "monitorTriggersInput", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluation getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluation.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluation value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
