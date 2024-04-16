package com.sumologic.s3_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.180Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.s3Source.S3SourcePathOutputReference")
public class S3SourcePathOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3SourcePathOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3SourcePathOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3SourcePathOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCustomServices(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.s3_source.S3SourcePathCustomServices>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.s3_source.S3SourcePathCustomServices> __cast_cd4240 = (java.util.List<com.sumologic.s3_source.S3SourcePathCustomServices>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.s3_source.S3SourcePathCustomServices __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putCustomServices", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTagFilters(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        if (software.amazon.jsii.Configuration.getRuntimeTypeChecking()) {
            if (
                 !(value instanceof com.hashicorp.cdktf.IResolvable)
                && !(value instanceof java.util.List)
                && !(value.getClass().equals(software.amazon.jsii.JsiiObject.class))
            ) {
                throw new IllegalArgumentException(
                    new java.lang.StringBuilder("Expected ")
                        .append("value")
                        .append(" to be one of: com.hashicorp.cdktf.IResolvable, java.util.List<com.sumologic.s3_source.S3SourcePathTagFilters>; received ")
                        .append(value.getClass()).toString());
            }
            if (value instanceof java.util.List) {
                @SuppressWarnings("unchecked")
                final java.util.List<com.sumologic.s3_source.S3SourcePathTagFilters> __cast_cd4240 = (java.util.List<com.sumologic.s3_source.S3SourcePathTagFilters>)value;
                for (int __idx_ac66f0 = 0; __idx_ac66f0 < __cast_cd4240.size(); __idx_ac66f0++) {
                    final com.sumologic.s3_source.S3SourcePathTagFilters __val_ac66f0 = __cast_cd4240.get(__idx_ac66f0);
                }
            }
        }
        software.amazon.jsii.Kernel.call(this, "putTagFilters", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBucketName() {
        software.amazon.jsii.Kernel.call(this, "resetBucketName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomServices() {
        software.amazon.jsii.Kernel.call(this, "resetCustomServices", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLimitToNamespaces() {
        software.amazon.jsii.Kernel.call(this, "resetLimitToNamespaces", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLimitToRegions() {
        software.amazon.jsii.Kernel.call(this, "resetLimitToRegions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLimitToServices() {
        software.amazon.jsii.Kernel.call(this, "resetLimitToServices", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPathExpression() {
        software.amazon.jsii.Kernel.call(this, "resetPathExpression", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagFilters() {
        software.amazon.jsii.Kernel.call(this, "resetTagFilters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUseVersionedApi() {
        software.amazon.jsii.Kernel.call(this, "resetUseVersionedApi", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.s3_source.S3SourcePathCustomServicesList getCustomServices() {
        return software.amazon.jsii.Kernel.get(this, "customServices", software.amazon.jsii.NativeType.forClass(com.sumologic.s3_source.S3SourcePathCustomServicesList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.s3_source.S3SourcePathSnsTopicOrSubscriptionArnList getSnsTopicOrSubscriptionArn() {
        return software.amazon.jsii.Kernel.get(this, "snsTopicOrSubscriptionArn", software.amazon.jsii.NativeType.forClass(com.sumologic.s3_source.S3SourcePathSnsTopicOrSubscriptionArnList.class));
    }

    public @org.jetbrains.annotations.NotNull com.sumologic.s3_source.S3SourcePathTagFiltersList getTagFilters() {
        return software.amazon.jsii.Kernel.get(this, "tagFilters", software.amazon.jsii.NativeType.forClass(com.sumologic.s3_source.S3SourcePathTagFiltersList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketNameInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCustomServicesInput() {
        return software.amazon.jsii.Kernel.get(this, "customServicesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToNamespacesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "limitToNamespacesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToRegionsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "limitToRegionsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToServicesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "limitToServicesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathExpressionInput() {
        return software.amazon.jsii.Kernel.get(this, "pathExpressionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTagFiltersInput() {
        return software.amazon.jsii.Kernel.get(this, "tagFiltersInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getUseVersionedApiInput() {
        return software.amazon.jsii.Kernel.get(this, "useVersionedApiInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBucketName() {
        return software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketName", java.util.Objects.requireNonNull(value, "bucketName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLimitToNamespaces() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "limitToNamespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLimitToNamespaces(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "limitToNamespaces", java.util.Objects.requireNonNull(value, "limitToNamespaces is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLimitToRegions() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "limitToRegions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLimitToRegions(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "limitToRegions", java.util.Objects.requireNonNull(value, "limitToRegions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLimitToServices() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "limitToServices", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLimitToServices(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "limitToServices", java.util.Objects.requireNonNull(value, "limitToServices is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPathExpression() {
        return software.amazon.jsii.Kernel.get(this, "pathExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPathExpression(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "pathExpression", java.util.Objects.requireNonNull(value, "pathExpression is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getUseVersionedApi() {
        return software.amazon.jsii.Kernel.get(this, "useVersionedApi", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setUseVersionedApi(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useVersionedApi", java.util.Objects.requireNonNull(value, "useVersionedApi is required"));
    }

    public void setUseVersionedApi(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "useVersionedApi", java.util.Objects.requireNonNull(value, "useVersionedApi is required"));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.s3_source.S3SourcePath getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.s3_source.S3SourcePath.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.s3_source.S3SourcePath value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
