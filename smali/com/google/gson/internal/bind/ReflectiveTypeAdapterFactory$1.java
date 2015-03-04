package com.google.gson.internal.bind; class ReflectiveTypeAdapterFactory$1 { void a() { int a;
a=0;// .class Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;
a=0;// .super Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;// .source "ReflectiveTypeAdapterFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->createBoundField(Lcom/google/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
a=0;// 
a=0;// .field final typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic val$context:Lcom/google/gson/Gson;
a=0;// 
a=0;// .field final synthetic val$field:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field final synthetic val$fieldType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;// .field final synthetic val$isPrimitive:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;Ljava/lang/String;ZZLcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/reflect/Field;Z)V
a=0;//     .locals 2
a=0;//     .param p2, "x0"    # Ljava/lang/String;
a=0;//     .param p3, "x1"    # Z
a=0;//     .param p4, "x2"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->this$0:Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$context:Lcom/google/gson/Gson;
a=0;// 
a=0;//     iput-object p6, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$fieldType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     iput-object p7, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     iput-boolean p8, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$isPrimitive:Z
a=0;// 
a=0;//     invoke-direct {p0, p2, p3, p4}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;-><init>(Ljava/lang/String;ZZ)V
a=0;// 
a=0;//     .line 82
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$context:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$fieldType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method read(Lcom/google/gson/stream/JsonReader;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "reader"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/lang/IllegalAccessException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v1, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "fieldValue":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$isPrimitive:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v1, p2, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;//     .param p1, "writer"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/lang/IllegalAccessException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "fieldValue":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$context:Lcom/google/gson/Gson;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$fieldType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v2, v3, v4}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     .line 89
a=0;//     .local v1, "t":Lcom/google/gson/TypeAdapter;
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     invoke-virtual {v1, p1, v0}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
}}
