package com.sumologic.elb_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.940Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.elbSource.ElbSourceDefaultDateFormatsList")
public class ElbSourceDefaultDateFormatsList extends com.hashicorp.cdktf.ComplexList {

    protected ElbSourceDefaultDateFormatsList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ElbSourceDefaultDateFormatsList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param wrapsSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public ElbSourceDefaultDateFormatsList(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Boolean wrapsSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(wrapsSet, "wrapsSet is required") });
    }

    /**
     * @param index the index of the item to return. This parameter is required.
     */
    public @org.jetbrains.annotations.NotNull com.sumologic.elb_source.ElbSourceDefaultDateFormatsOutputReference get(final @org.jetbrains.annotations.NotNull java.lang.Number index) {
        return software.amazon.jsii.Kernel.call(this, "get", software.amazon.jsii.NativeType.forClass(com.sumologic.elb_source.ElbSourceDefaultDateFormatsOutputReference.class), new Object[] { java.util.Objects.requireNonNull(index, "index is required") });
    }

    /**
     * The attribute on the parent resource this class is referencing.
     */
    @Override
    protected @org.jetbrains.annotations.NotNull java.lang.String getTerraformAttribute() {
        return software.amazon.jsii.Kernel.get(this, "terraformAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * The attribute on the parent resource this class is referencing.
     */
    @Override
    protected void setTerraformAttribute(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "terraformAttribute", java.util.Objects.requireNonNull(value, "terraformAttribute is required"));
    }

    /**
     * The parent resource.
     */
    @Override
    protected @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent getTerraformResource() {
        return software.amazon.jsii.Kernel.get(this, "terraformResource", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IInterpolatingParent.class));
    }

    /**
     * The parent resource.
     */
    @Override
    protected void setTerraformResource(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent value) {
        software.amazon.jsii.Kernel.set(this, "terraformResource", java.util.Objects.requireNonNull(value, "terraformResource is required"));
    }

    /**
     * whether the list is wrapping a set (will add tolist() to be able to access an item via an index).
     */
    @Override
    protected @org.jetbrains.annotations.NotNull java.lang.Boolean getWrapsSet() {
        return software.amazon.jsii.Kernel.get(this, "wrapsSet", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    /**
     * whether the list is wrapping a set (will add tolist() to be able to access an item via an index).
     */
    @Override
    protected void setWrapsSet(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "wrapsSet", java.util.Objects.requireNonNull(value, "wrapsSet is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable java.util.List<com.sumologic.elb_source.ElbSourceDefaultDateFormats> value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
