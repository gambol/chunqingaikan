package com.twocloo.com.cn.activitys; class AddUserLabelActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "AddUserLabelActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 7
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "h":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/adapters/AddLabelAdapter;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/adapters/AddLabelAdapter;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$0(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v4, v5, v6}, Lcom/twocloo/com/cn/adapters/AddLabelAdapter;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/adapters/AddLabelAdapter;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$1(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;Lcom/twocloo/com/cn/adapters/AddLabelAdapter;)V
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$2(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$3(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Lcom/twocloo/com/cn/adapters/AddLabelAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/view/CustomGridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 68
a=0;//     .end local v0    # "h":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .end local v1    # "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     .restart local v0    # "h":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Integer);v2=(Uninit);v3=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->access$0(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 58
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     .end local v0    # "h":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);v4=(Uninit);
a=0;//     iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     .local v2, "megString":Ljava/lang/String;
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v3, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
