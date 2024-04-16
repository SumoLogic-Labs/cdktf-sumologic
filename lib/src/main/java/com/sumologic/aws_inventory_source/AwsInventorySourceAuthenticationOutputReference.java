package com.sumologic.aws_inventory_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.374Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.awsInventorySource.AwsInventorySourceAuthenticationOutputReference")
public class AwsInventorySourceAuthenticationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AwsInventorySourceAuthenticationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AwsInventorySourceAuthenticationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AwsInventorySourceAuthenticationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetAccessKey() {
        software.amazon.jsii.Kernel.call(this, "resetAccessKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthProviderX509CertUrl() {
        software.amazon.jsii.Kernel.call(this, "resetAuthProviderX509CertUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAuthUri() {
        software.amazon.jsii.Kernel.call(this, "resetAuthUri", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientEmail() {
        software.amazon.jsii.Kernel.call(this, "resetClientEmail", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientId() {
        software.amazon.jsii.Kernel.call(this, "resetClientId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientX509CertUrl() {
        software.amazon.jsii.Kernel.call(this, "resetClientX509CertUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateKey() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateKeyId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProjectId() {
        software.amazon.jsii.Kernel.call(this, "resetProjectId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecretKey() {
        software.amazon.jsii.Kernel.call(this, "resetSecretKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTokenUri() {
        software.amazon.jsii.Kernel.call(this, "resetTokenUri", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "accessKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthProviderX509CertUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "authProviderX509CertUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthUriInput() {
        return software.amazon.jsii.Kernel.get(this, "authUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientEmailInput() {
        return software.amazon.jsii.Kernel.get(this, "clientEmailInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientIdInput() {
        return software.amazon.jsii.Kernel.get(this, "clientIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientX509CertUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "clientX509CertUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "privateKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "privateKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProjectIdInput() {
        return software.amazon.jsii.Kernel.get(this, "projectIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "secretKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenUriInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenUriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessKey() {
        return software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessKey", java.util.Objects.requireNonNull(value, "accessKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthProviderX509CertUrl() {
        return software.amazon.jsii.Kernel.get(this, "authProviderX509CertUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthProviderX509CertUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authProviderX509CertUrl", java.util.Objects.requireNonNull(value, "authProviderX509CertUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthUri() {
        return software.amazon.jsii.Kernel.get(this, "authUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authUri", java.util.Objects.requireNonNull(value, "authUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientEmail() {
        return software.amazon.jsii.Kernel.get(this, "clientEmail", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientEmail(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientEmail", java.util.Objects.requireNonNull(value, "clientEmail is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientId() {
        return software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientId", java.util.Objects.requireNonNull(value, "clientId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientX509CertUrl() {
        return software.amazon.jsii.Kernel.get(this, "clientX509CertUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientX509CertUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientX509CertUrl", java.util.Objects.requireNonNull(value, "clientX509CertUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateKey", java.util.Objects.requireNonNull(value, "privateKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateKeyId() {
        return software.amazon.jsii.Kernel.get(this, "privateKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateKeyId", java.util.Objects.requireNonNull(value, "privateKeyId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProjectId() {
        return software.amazon.jsii.Kernel.get(this, "projectId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProjectId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "projectId", java.util.Objects.requireNonNull(value, "projectId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretKey() {
        return software.amazon.jsii.Kernel.get(this, "secretKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretKey", java.util.Objects.requireNonNull(value, "secretKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTokenUri() {
        return software.amazon.jsii.Kernel.get(this, "tokenUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTokenUri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tokenUri", java.util.Objects.requireNonNull(value, "tokenUri is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.aws_inventory_source.AwsInventorySourceAuthentication getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.aws_inventory_source.AwsInventorySourceAuthentication.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.aws_inventory_source.AwsInventorySourceAuthentication value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
