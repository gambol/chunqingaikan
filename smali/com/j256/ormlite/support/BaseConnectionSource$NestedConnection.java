package com.j256.ormlite.support; class BaseConnectionSource$NestedConnection { void a() { int a;
a=0;// .class Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseConnectionSource.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/support/BaseConnectionSource;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "NestedConnection"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;// .field private nestedC:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     .locals 1
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 104
a=0;//     #p0=(Reference,Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .line 105
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->nestedC:I
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public decrementAndGet()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->nestedC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->nestedC:I
a=0;// 
a=0;//     .line 114
a=0;//     iget v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->nestedC:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public increment()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->nestedC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->nestedC:I
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
}}
