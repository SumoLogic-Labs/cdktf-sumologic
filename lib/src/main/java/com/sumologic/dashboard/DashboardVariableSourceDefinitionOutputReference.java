package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.884Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariableSourceDefinitionOutputReference")
public class DashboardVariableSourceDefinitionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DashboardVariableSourceDefinitionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DashboardVariableSourceDefinitionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public DashboardVariableSourceDefinitionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCsvVariableSourceDefinition(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putCsvVariableSourceDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLogQueryVariableSourceDefinition(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putLogQueryVariableSourceDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMetadataVariableSourceDefinition(final @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putMetadataVariableSourceDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCsvVariableSourceDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetCsvVariableSourceDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLogQueryVariableSourceDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetLogQueryVariableSourceDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMetadataVariableSourceDefinition() {
        software.amazon.jsii.Kernel.call(this, "resetMetadataVariableSourceDefinition", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinitionOutputReference getCsvVariableSourceDefinition() {
        return software.amazon.jsii.Kernel.get(this, "csvVariableSourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinitionOutputReference getLogQueryVariableSourceDefinition() {
        return software.amazon.jsii.Kernel.get(this, "logQueryVariableSourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionOutputReference getMetadataVariableSourceDefinition() {
        return software.amazon.jsii.Kernel.get(this, "metadataVariableSourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition getCsvVariableSourceDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "csvVariableSourceDefinitionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition getLogQueryVariableSourceDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "logQueryVariableSourceDefinitionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition getMetadataVariableSourceDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "metadataVariableSourceDefinitionInput", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
