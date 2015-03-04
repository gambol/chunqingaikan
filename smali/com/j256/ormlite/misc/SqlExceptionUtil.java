package com.j256.ormlite.misc; class SqlExceptionUtil { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/misc/SqlExceptionUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SqlExceptionUtil.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/j256/ormlite/misc/SqlExceptionUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;//     .locals 1
a=0;//     .param p0, "message"    # Ljava/lang/String;
a=0;//     .param p1, "cause"    # Ljava/lang/Throwable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     invoke-direct {v0, p0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 23
a=0;//     .local v0, "sqlException":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     invoke-virtual {v0, p1}, Ljava/sql/SQLException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 24
a=0;//     return-object v0
a=0;// .end method
}}
