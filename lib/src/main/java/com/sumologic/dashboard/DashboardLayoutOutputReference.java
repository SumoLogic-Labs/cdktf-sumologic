package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.822Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardLayoutOutputReference")
public class DashboardLayoutOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardLayoutOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardLayoutOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardLayoutOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putGrid(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardLayoutGrid value) {
        software.amazon.jsii.Kernel.call(this, "putGrid", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetGrid() {
        software.amazon.jsii.Kernel.call(this, "resetGrid", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardLayoutGridOutputReference getGrid() {
        return software.amazon.jsii.Kernel.get(this, "grid", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayoutGridOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardLayoutGrid getGridInput() {
        return software.amazon.jsii.Kernel.get(this, "gridInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayoutGrid.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardLayout getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardLayout.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardLayout value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
