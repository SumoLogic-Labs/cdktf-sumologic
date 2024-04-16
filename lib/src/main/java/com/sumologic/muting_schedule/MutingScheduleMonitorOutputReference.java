package com.sumologic.muting_schedule;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.138Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.mutingSchedule.MutingScheduleMonitorOutputReference")
public class MutingScheduleMonitorOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MutingScheduleMonitorOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MutingScheduleMonitorOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MutingScheduleMonitorOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAll() {
        software.amazon.jsii.Kernel.call(this, "resetAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIds() {
        software.amazon.jsii.Kernel.call(this, "resetIds", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllInput() {
        return software.amazon.jsii.Kernel.get(this, "allInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "idsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAll() {
        return software.amazon.jsii.Kernel.get(this, "all", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAll(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "all", java.util.Objects.requireNonNull(value, "all is required"));
    }

    public void setAll(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "all", java.util.Objects.requireNonNull(value, "all is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ids", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ids", java.util.Objects.requireNonNull(value, "ids is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.muting_schedule.MutingScheduleMonitor getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.muting_schedule.MutingScheduleMonitor.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.muting_schedule.MutingScheduleMonitor value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
