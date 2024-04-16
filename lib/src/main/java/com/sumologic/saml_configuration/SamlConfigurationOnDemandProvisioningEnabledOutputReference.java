package com.sumologic.saml_configuration;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.184Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.samlConfiguration.SamlConfigurationOnDemandProvisioningEnabledOutputReference")
public class SamlConfigurationOnDemandProvisioningEnabledOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SamlConfigurationOnDemandProvisioningEnabledOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SamlConfigurationOnDemandProvisioningEnabledOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SamlConfigurationOnDemandProvisioningEnabledOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetFirstNameAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetFirstNameAttribute", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLastNameAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetLastNameAttribute", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFirstNameAttributeInput() {
        return software.amazon.jsii.Kernel.get(this, "firstNameAttributeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLastNameAttributeInput() {
        return software.amazon.jsii.Kernel.get(this, "lastNameAttributeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOnDemandProvisioningRolesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "onDemandProvisioningRolesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFirstNameAttribute() {
        return software.amazon.jsii.Kernel.get(this, "firstNameAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFirstNameAttribute(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "firstNameAttribute", java.util.Objects.requireNonNull(value, "firstNameAttribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastNameAttribute() {
        return software.amazon.jsii.Kernel.get(this, "lastNameAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLastNameAttribute(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lastNameAttribute", java.util.Objects.requireNonNull(value, "lastNameAttribute is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOnDemandProvisioningRoles() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "onDemandProvisioningRoles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setOnDemandProvisioningRoles(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "onDemandProvisioningRoles", java.util.Objects.requireNonNull(value, "onDemandProvisioningRoles is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.saml_configuration.SamlConfigurationOnDemandProvisioningEnabled value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
