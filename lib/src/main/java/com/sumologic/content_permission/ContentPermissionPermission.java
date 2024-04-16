package com.sumologic.content_permission;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.601Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.contentPermission.ContentPermissionPermission")
@software.amazon.jsii.Jsii.Proxy(ContentPermissionPermission.Jsii$Proxy.class)
public interface ContentPermissionPermission extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#permission_name ContentPermission#permission_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPermissionName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#source_id ContentPermission#source_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#source_type ContentPermission#source_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSourceType();

    /**
     * @return a {@link Builder} of {@link ContentPermissionPermission}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ContentPermissionPermission}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ContentPermissionPermission> {
        java.lang.String permissionName;
        java.lang.String sourceId;
        java.lang.String sourceType;

        /**
         * Sets the value of {@link ContentPermissionPermission#getPermissionName}
         * @param permissionName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#permission_name ContentPermission#permission_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder permissionName(java.lang.String permissionName) {
            this.permissionName = permissionName;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionPermission#getSourceId}
         * @param sourceId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#source_id ContentPermission#source_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceId(java.lang.String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * Sets the value of {@link ContentPermissionPermission#getSourceType}
         * @param sourceType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/content_permission#source_type ContentPermission#source_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder sourceType(java.lang.String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ContentPermissionPermission}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ContentPermissionPermission build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ContentPermissionPermission}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ContentPermissionPermission {
        private final java.lang.String permissionName;
        private final java.lang.String sourceId;
        private final java.lang.String sourceType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.permissionName = software.amazon.jsii.Kernel.get(this, "permissionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceId = software.amazon.jsii.Kernel.get(this, "sourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceType = software.amazon.jsii.Kernel.get(this, "sourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.permissionName = java.util.Objects.requireNonNull(builder.permissionName, "permissionName is required");
            this.sourceId = java.util.Objects.requireNonNull(builder.sourceId, "sourceId is required");
            this.sourceType = java.util.Objects.requireNonNull(builder.sourceType, "sourceType is required");
        }

        @Override
        public final java.lang.String getPermissionName() {
            return this.permissionName;
        }

        @Override
        public final java.lang.String getSourceId() {
            return this.sourceId;
        }

        @Override
        public final java.lang.String getSourceType() {
            return this.sourceType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("permissionName", om.valueToTree(this.getPermissionName()));
            data.set("sourceId", om.valueToTree(this.getSourceId()));
            data.set("sourceType", om.valueToTree(this.getSourceType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.contentPermission.ContentPermissionPermission"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ContentPermissionPermission.Jsii$Proxy that = (ContentPermissionPermission.Jsii$Proxy) o;

            if (!permissionName.equals(that.permissionName)) return false;
            if (!sourceId.equals(that.sourceId)) return false;
            return this.sourceType.equals(that.sourceType);
        }

        @Override
        public final int hashCode() {
            int result = this.permissionName.hashCode();
            result = 31 * result + (this.sourceId.hashCode());
            result = 31 * result + (this.sourceType.hashCode());
            return result;
        }
    }
}
