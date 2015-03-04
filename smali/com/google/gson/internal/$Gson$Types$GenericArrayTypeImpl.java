package com.google.gson.internal; class $Gson$Types$GenericArrayTypeImpl { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "$Gson$Types.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Serializable;
a=0;// .implements Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/$Gson$Types;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1a
a=0;//     name = "GenericArrayTypeImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final componentType:Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/reflect/Type;)V
a=0;//     .locals 1
a=0;//     .param p1, "componentType"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 502
a=0;//     #p0=(Reference,Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/$Gson$Types;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;->componentType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 503
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     .end local p1    # "o":Ljava/lang/Object;
a=0;//     invoke-static {p0, p1}, Lcom/google/gson/internal/$Gson$Types;->equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getGenericComponentType()Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;->componentType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;->componentType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;->componentType:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Types;->typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "[]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
