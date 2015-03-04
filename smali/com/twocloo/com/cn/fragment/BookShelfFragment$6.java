package com.twocloo.com.cn.fragment; class BookShelfFragment$6 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/com/cn/view/PullRefreshListView$OnLoadmoreListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookShelfFragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     .line 622
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onLoadmore()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 626
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$21(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$22(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;// 
a=0;//     .line 627
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$21(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x14
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$23(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;// 
a=0;//     .line 628
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$24(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 629
a=0;//     sget-object v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getTotalCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 630
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$25(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Z)V
a=0;// 
a=0;//     .line 638
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 632
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     .line 633
a=0;//     .local v0, "mList":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$26(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x14
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v0, v2, v3, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->queryMyBFData(Ljava/util/Vector;Ljava/lang/String;II)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 634
a=0;//     sget-object v1, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 635
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$6;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
