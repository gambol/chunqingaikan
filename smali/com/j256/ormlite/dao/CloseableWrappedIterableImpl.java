package com.j256.ormlite.dao; class CloseableWrappedIterableImpl { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CloseableWrappedIterableImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final iterable:Lcom/j256/ormlite/dao/CloseableIterable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterable",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private iterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/dao/CloseableIterable;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterable",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;, "Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl<TT;>;"
a=0;//     .local p1, "iterable":Lcom/j256/ormlite/dao/CloseableIterable;, "Lcom/j256/ormlite/dao/CloseableIterable<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterable:Lcom/j256/ormlite/dao/CloseableIterable;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;, "Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;, "Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl<TT;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 32
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterable:Lcom/j256/ormlite/dao/CloseableIterable;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterable;->closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 29
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;, "Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;, "Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
}}
