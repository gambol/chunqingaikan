package com.j256.ormlite.dao; class BaseDaoImpl$2 { void a() { int a;
a=0;// .class Lcom/j256/ormlite/dao/BaseDaoImpl$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseDaoImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/CloseableIterable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/j256/ormlite/dao/BaseDaoImpl;->getWrappedIterable()Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/dao/CloseableIterable",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/j256/ormlite/dao/BaseDaoImpl;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl$2;, "Lcom/j256/ormlite/dao/BaseDaoImpl.2;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$2;->this$0:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 494
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl$2;, "Lcom/j256/ormlite/dao/BaseDaoImpl.2;"
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$2;->this$0:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v1, v2}, Lcom/j256/ormlite/dao/BaseDaoImpl;->access$100(Lcom/j256/ormlite/dao/BaseDaoImpl;I)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 495
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 496
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not build iterator for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$2;->this$0:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/j256/ormlite/dao/BaseDaoImpl;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseDaoImpl$2;, "Lcom/j256/ormlite/dao/BaseDaoImpl.2;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl$2;->closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
}}
