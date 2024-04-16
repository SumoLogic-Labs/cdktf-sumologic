package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.877Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTimeRangeOutputReference")
public class DashboardTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBeginBoundedTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCompleteLiteralTimeRange(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange value) {
        software.amazon.jsii.Kernel.call(this, "putCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBeginBoundedTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetBeginBoundedTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompleteLiteralTimeRange() {
        software.amazon.jsii.Kernel.call(this, "resetCompleteLiteralTimeRange", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeOutputReference getBeginBoundedTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRangeOutputReference getCompleteLiteralTimeRange() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRangeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange getBeginBoundedTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "beginBoundedTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange getCompleteLiteralTimeRangeInput() {
        return software.amazon.jsii.Kernel.get(this, "completeLiteralTimeRangeInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeCompleteLiteralTimeRange.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
