package com.twocloo.com.cn.activitys; class BfMLActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BfMLActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "BfMLActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BfMLActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 11
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     #v9=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 83
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Null);v10=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$0(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$0(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$1(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/threads/SubedchaptersinfoThread;->scif:Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->getSubed_textid_list()Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ListView;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->getSelection()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x4
a=0;// 
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->getSelection()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x4
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     move v0, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 94
a=0;//     :sswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$3(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$3(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$3(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$4(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$5(Lcom/twocloo/com/cn/activitys/BfMLActivity;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/BfMLAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$6(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$7(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$0(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/util/HashSet;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$9(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/adapters/BfMLAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/HashSet;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/BfMLAdapter;);
a=0;//     invoke-static {v10, v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$10(Lcom/twocloo/com/cn/activitys/BfMLActivity;Lcom/twocloo/com/cn/adapters/BfMLAdapter;)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->getSelection()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x4
a=0;// 
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$2(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/adapters/BfMLAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/BfMLAdapter;->getSelection()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v9, v1, -0x4
a=0;// 
a=0;//     :cond_5
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Landroid/widget/ListView;->setSelection(I)V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$11(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$4(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$11(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$12(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$4(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getAuthor()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$4(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getFinishflag()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$13(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u8fde\u8f7d\u4e2d"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$13(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u5df2\u5b8c\u7ed3"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     :sswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Null);v10=(Uninit);
a=0;//     iget v8, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     .line 112
a=0;//     .local v8, "markvip":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v8, v0, :cond_7
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 115
a=0;//     .local v7, "intent":Landroid/content/Intent;
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$8(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 116
a=0;//     const-string v0, "textid"
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 117
a=0;//     const-string v0, "beg"
a=0;// 
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 118
a=0;//     const-string v0, "isVip"
a=0;// 
a=0;//     invoke-virtual {v7, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 119
a=0;//     const-string v0, "Tag"
a=0;// 
a=0;//     const-string v1, "BookMarkActivity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 120
a=0;//     const/high16 v0, 0x4000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     .end local v7    # "intent":Landroid/content/Intent;
a=0;//     :cond_7
a=0;//     #v0=(One);v1=(Uninit);v7=(Uninit);
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v7}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 125
a=0;//     .restart local v7    # "intent":Landroid/content/Intent;
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     const-string v0, "beg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 126
a=0;//     const-string v0, "txid"
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1, v7}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x7b -> :sswitch_1
a=0;//         0x7c -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
}}
