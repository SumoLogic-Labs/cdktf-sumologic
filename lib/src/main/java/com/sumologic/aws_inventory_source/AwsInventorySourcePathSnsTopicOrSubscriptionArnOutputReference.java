package com.sumologic.aws_inventory_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.391Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.awsInventorySource.AwsInventorySourcePathSnsTopicOrSubscriptionArnOutputReference")
public class AwsInventorySourcePathSnsTopicOrSubscriptionArnOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AwsInventorySourcePathSnsTopicOrSubscriptionArnOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AwsInventorySourcePathSnsTopicOrSubscriptionArnOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public AwsInventorySourcePathSnsTopicOrSubscriptionArnOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getIsSuccess() {
        return software.amazon.jsii.Kernel.get(this, "isSuccess", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.Nullable com.sumologic.aws_inventory_source.AwsInventorySourcePathSnsTopicOrSubscriptionArn getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(com.sumologic.aws_inventory_source.AwsInventorySourcePathSnsTopicOrSubscriptionArn.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.sumologic.aws_inventory_source.AwsInventorySourcePathSnsTopicOrSubscriptionArn value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
