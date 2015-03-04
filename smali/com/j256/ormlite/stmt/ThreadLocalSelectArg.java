package com.j256.ormlite.stmt; class ThreadLocalSelectArg { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;
a=0;// .super Lcom/j256/ormlite/stmt/BaseArgumentHolder;
a=0;// .source "ThreadLocalSelectArg.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private threadValue:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/BaseArgumentHolder;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;);
a=0;//     new-instance v0, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/field/SqlType;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "sqlType"    # Lcom/j256/ormlite/field/SqlType;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/BaseArgumentHolder;-><init>(Lcom/j256/ormlite/field/SqlType;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;);
a=0;//     new-instance v0, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 27
a=0;//     invoke-virtual {p0, p2}, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/BaseArgumentHolder;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;);
a=0;//     new-instance v0, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/BaseArgumentHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;);
a=0;//     new-instance v0, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p0, p2}, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected getValue()Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "wrapper":Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, v0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;->value:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected isValueSet()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
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
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg;->threadValue:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     new-instance v1, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;);
a=0;//     invoke-direct {v1, p1}, Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/ThreadLocalSelectArg$ValueWrapper;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
}}
