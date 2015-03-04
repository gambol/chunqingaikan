package com.j256.ormlite.stmt.mapped; class MappedCreate$KeyHolder { void a() { int a;
a=0;// .class Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MappedCreate.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/support/GeneratedKeyHolder;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "KeyHolder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field key:Ljava/lang/Number;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/j256/ormlite/stmt/mapped/MappedCreate$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/stmt/mapped/MappedCreate$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addKey(Ljava/lang/Number;)V
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/Number;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;->key:Ljava/lang/Number;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;->key:Ljava/lang/Number;
a=0;// 
a=0;//     .line 250
a=0;//     return-void
a=0;// 
a=0;//     .line 248
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "generated key has already been set to "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;->key:Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", now set to "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getKey()Ljava/lang/Number;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;->key:Ljava/lang/Number;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     return-object v0
a=0;// .end method
}}
