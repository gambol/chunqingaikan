package com.twocloo.com.cn.activitys; class ManageBookShelf$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ManageBookShelf.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ManageBookShelf;->createConfirmDialog(Landroid/content/Context;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;// .field private final synthetic val$ctx:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->val$ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 278
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 283
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v1, v4, :cond_0
a=0;// 
a=0;//     .line 295
a=0;//     new-instance v3, Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/task/DelArrangeBookTask;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->val$ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     check-cast v4, Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$4(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->dataCallBack:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     invoke-direct {v3, v4, v5, v6}, Lcom/twocloo/com/cn/task/DelArrangeBookTask;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     .line 296
a=0;//     .local v3, "task":Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/task/DelArrangeBookTask;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Void;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/task/DelArrangeBookTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 297
a=0;//     return-void
a=0;// 
a=0;//     .line 284
a=0;//     .end local v3    # "task":Lcom/twocloo/com/cn/task/DelArrangeBookTask;
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Integer);v5=(Conflicted);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 287
a=0;//     .local v2, "s":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$4(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->getSelectedMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 290
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$3;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$3(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 291
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 283
a=0;//     .end local v0    # "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v2    # "s":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
