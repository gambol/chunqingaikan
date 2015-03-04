package com.j256.ormlite.dao; class EagerForeignCollection$1 { void a() { int a;
a=0;// .class Lcom/j256/ormlite/dao/EagerForeignCollection$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EagerForeignCollection.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/j256/ormlite/dao/EagerForeignCollection;->iteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
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
a=0;//         "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private offset:I
a=0;// 
a=0;// .field final synthetic this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/j256/ormlite/dao/EagerForeignCollection;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection$1;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeQuietly()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public current()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public first()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 57
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getRawResults()Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasNext()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
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
a=0;// .method public moveRelative(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "relativeOffset"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 96
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public moveToNext()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 131
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public next()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public nextThrow()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 70
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public previous()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     .line 88
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection$1;, "Lcom/j256/ormlite/dao/EagerForeignCollection.1;"
a=0;//     iget v2, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "next() must be called before remove()"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Uninit);
a=0;//     iget v2, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v3}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "current results position ("
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ") is out of bounds"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Integer);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/dao/EagerForeignCollection;->access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->offset:I
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 110
a=0;//     .local v1, "removed":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 112
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;->this$0:Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/dao/Dao;->delete(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 118
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// .end method
}}
