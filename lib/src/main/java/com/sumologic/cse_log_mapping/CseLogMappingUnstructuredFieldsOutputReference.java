package com.sumologic.cse_log_mapping;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.752Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMappingUnstructuredFieldsOutputReference")
public class CseLogMappingUnstructuredFieldsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CseLogMappingUnstructuredFieldsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CseLogMappingUnstructuredFieldsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CseLogMappingUnstructuredFieldsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPatternNamesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "patternNamesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPatternNames() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "patternNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPatternNames(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "patternNames", java.util.Objects.requireNonNull(value, "patternNames is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.cse_log_mapping.CseLogMappingUnstructuredFields value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
