package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.869Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeOutputReference")
public class DashboardTimeRangeBeginBoundedTimeRangeOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardTimeRangeBeginBoundedTimeRangeOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardTimeRangeBeginBoundedTimeRangeOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardTimeRangeBeginBoundedTimeRangeOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFrom(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFrom value) {
        software.amazon.jsii.Kernel.call(this, "putFrom", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTo(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeTo value) {
        software.amazon.jsii.Kernel.call(this, "putTo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTo() {
        software.amazon.jsii.Kernel.call(this, "resetTo", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFromOutputReference getFrom() {
        return software.amazon.jsii.Kernel.get(this, "from", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFromOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeToOutputReference getTo() {
        return software.amazon.jsii.Kernel.get(this, "to", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeToOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFrom getFromInput() {
        return software.amazon.jsii.Kernel.get(this, "fromInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeFrom.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeTo getToInput() {
        return software.amazon.jsii.Kernel.get(this, "toInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRangeTo.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardTimeRangeBeginBoundedTimeRange value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
