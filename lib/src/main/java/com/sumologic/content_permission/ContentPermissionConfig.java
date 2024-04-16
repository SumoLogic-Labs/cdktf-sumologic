package com.sumologic.content_permission;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.600Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.contentPermission.ContentPermissionConfig")
@software.amazon.jsii.Jsii.Proxy(ContentPermissionConfig.Jsii$Proxy.class)
public interface ContentPermissionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#content_id ContentPermission#content_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getContentId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#notify_recipient ContentPermission#notify_recipient}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getNotifyRecipient();

    /**
     * permission block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#permission ContentPermission#permission}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getPermission();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#id ContentPermission#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#notification_message ContentPermission#notification_message}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNotificationMessage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ContentPermissionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ContentPermissionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ContentPermissionConfig> {
        java.lang.String contentId;
        java.lang.Object notifyRecipient;
        java.lang.Object permission;
        java.lang.String id;
        java.lang.String notificationMessage;
        java.lang.Object connection;
        java.lang.Object count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link ContentPermissionConfig#getContentId}
         * @param contentId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#content_id ContentPermission#content_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder contentId(java.lang.String contentId) {
            this.contentId = contentId;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getNotifyRecipient}
         * @param notifyRecipient Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#notify_recipient ContentPermission#notify_recipient}. This parameter is required.
         * @return {@code this}
         */
        public Builder notifyRecipient(java.lang.Boolean notifyRecipient) {
            this.notifyRecipient = notifyRecipient;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getNotifyRecipient}
         * @param notifyRecipient Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#notify_recipient ContentPermission#notify_recipient}. This parameter is required.
         * @return {@code this}
         */
        public Builder notifyRecipient(com.hashicorp.cdktf.IResolvable notifyRecipient) {
            this.notifyRecipient = notifyRecipient;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getPermission}
         * @param permission permission block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#permission ContentPermission#permission}
         * @return {@code this}
         */
        public Builder permission(com.hashicorp.cdktf.IResolvable permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getPermission}
         * @param permission permission block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#permission ContentPermission#permission}
         * @return {@code this}
         */
        public Builder permission(java.util.List<? extends com.sumologic.content_permission.ContentPermissionPermission> permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#id ContentPermission#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getNotificationMessage}
         * @param notificationMessage Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#notification_message ContentPermission#notification_message}.
         * @return {@code this}
         */
        public Builder notificationMessage(java.lang.String notificationMessage) {
            this.notificationMessage = notificationMessage;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(com.hashicorp.cdktf.TerraformCount count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ContentPermissionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ContentPermissionConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ContentPermissionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ContentPermissionConfig {
        private final java.lang.String contentId;
        private final java.lang.Object notifyRecipient;
        private final java.lang.Object permission;
        private final java.lang.String id;
        private final java.lang.String notificationMessage;
        private final java.lang.Object connection;
        private final java.lang.Object count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.contentId = software.amazon.jsii.Kernel.get(this, "contentId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notifyRecipient = software.amazon.jsii.Kernel.get(this, "notifyRecipient", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.permission = software.amazon.jsii.Kernel.get(this, "permission", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notificationMessage = software.amazon.jsii.Kernel.get(this, "notificationMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.contentId = java.util.Objects.requireNonNull(builder.contentId, "contentId is required");
            this.notifyRecipient = java.util.Objects.requireNonNull(builder.notifyRecipient, "notifyRecipient is required");
            this.permission = java.util.Objects.requireNonNull(builder.permission, "permission is required");
            this.id = builder.id;
            this.notificationMessage = builder.notificationMessage;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getContentId() {
            return this.contentId;
        }

        @Override
        public final java.lang.Object getNotifyRecipient() {
            return this.notifyRecipient;
        }

        @Override
        public final java.lang.Object getPermission() {
            return this.permission;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getNotificationMessage() {
            return this.notificationMessage;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Object getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("contentId", om.valueToTree(this.getContentId()));
            data.set("notifyRecipient", om.valueToTree(this.getNotifyRecipient()));
            data.set("permission", om.valueToTree(this.getPermission()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getNotificationMessage() != null) {
                data.set("notificationMessage", om.valueToTree(this.getNotificationMessage()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.contentPermission.ContentPermissionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ContentPermissionConfig.Jsii$Proxy that = (ContentPermissionConfig.Jsii$Proxy) o;

            if (!contentId.equals(that.contentId)) return false;
            if (!notifyRecipient.equals(that.notifyRecipient)) return false;
            if (!permission.equals(that.permission)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.notificationMessage != null ? !this.notificationMessage.equals(that.notificationMessage) : that.notificationMessage != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.contentId.hashCode();
            result = 31 * result + (this.notifyRecipient.hashCode());
            result = 31 * result + (this.permission.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.notificationMessage != null ? this.notificationMessage.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}