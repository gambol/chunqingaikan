package com.google.gson; class FieldAttributes { void a() { int a;
a=0;// .class public final Lcom/google/gson/FieldAttributes;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FieldAttributes.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final field:Ljava/lang/reflect/Field;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/reflect/Field;)V
a=0;//     .locals 0
a=0;//     .param p1, "f"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/google/gson/FieldAttributes;);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/$Gson$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p1, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "instance"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/IllegalAccessException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T::",
a=0;//             "Ljava/lang/annotation/Annotation;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     .local p1, "annotation":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnnotations()Ljava/util/Collection;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Collection",
a=0;//             "<",
a=0;//             "Ljava/lang/annotation/Annotation;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDeclaredClass()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDeclaredType()Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDeclaringClass()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasModifier(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "modifier"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method isSynthetic()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/google/gson/FieldAttributes;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->isSynthetic()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
