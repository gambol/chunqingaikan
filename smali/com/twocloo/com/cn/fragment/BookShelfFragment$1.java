package com.twocloo.com.cn.fragment; class BookShelfFragment$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "BookShelfFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookShelfFragment;
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     .line 123
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;Landroid/os/Message;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 410
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->downbook(Landroid/os/Message;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;)Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private downbook(Landroid/os/Message;)V
a=0;//     .locals 10
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 411
a=0;//     #v9=(Null);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Vector;);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 457
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 413
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     iget v8, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 414
a=0;//     .local v0, "a":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     iget v8, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 415
a=0;//     .local v4, "title":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     iget v8, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/BFBook;->getSource()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 416
a=0;//     .local v3, "source":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     iget v8, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/BFBook;->getIs_fence()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 417
a=0;//     .local v2, "isFence":I
a=0;//     #v2=(Integer);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "7pYwmBnsHh4t6ZSK"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v7, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 418
a=0;//     .local v5, "token":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 419
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u6b63\u5728\u4e0b\u8f7d\u4e2d."
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8, v9}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     :cond_1
a=0;//     #v7=(Boolean);v8=(PosByte);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v7}, Ljava/util/Hashtable;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     if-lt v7, v8, :cond_2
a=0;// 
a=0;//     .line 424
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u8bf7\u7a0d\u7b49\u7247\u523b."
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8, v9}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 427
a=0;//     :cond_2
a=0;//     #v7=(Integer);v8=(PosByte);
a=0;//     const-string v7, "qidian"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne v7, v2, :cond_6
a=0;// 
a=0;//     .line 428
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v1, v7, v0, v4, v5}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 429
a=0;//     .local v1, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v1, v5}, Lcom/twocloo/com/cn/http/DownFile;->start(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 430
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v7, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 431
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     .line 432
a=0;//     .local v6, "uidd":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 433
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 436
a=0;//     :cond_3
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v0, v6}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v0, v6, v9}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 449
a=0;//     .end local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     .end local v6    # "uidd":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 451
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 456
a=0;//     :goto_2
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v6=(Uninit);v7=(Boolean);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v7, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 442
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 444
a=0;//     :cond_7
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v1, v7, v0, v4}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 445
a=0;//     .restart local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 446
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     invoke-virtual {v7, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 454
a=0;//     .end local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 33
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget v4, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sparse-switch v4, :sswitch_data_0
a=0;// 
a=0;//     .line 403
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 129
a=0;//     :sswitch_0
a=0;//     #v0=(Reference,Landroid/os/Message;);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v7, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 131
a=0;//     .local v12, "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$0(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v4, v7, v8}, Lcom/twocloo/com/cn/db/LastReadTable;->queryLastBook(Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     .line 133
a=0;//     .local v28, "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v28=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v28, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u6700\u540e\u9605\u8bfb\u4fe1\u606f"
a=0;// 
a=0;//     invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "|"
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getIsVip()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "|"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getPosi()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     if-eqz v28, :cond_4
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getIsVip()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-eq v4, v7, :cond_2
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 141
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v21, Landroid/content/Intent;
a=0;// 
a=0;//     #v21=(UninitRef,Landroid/content/Intent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0, v4, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 142
a=0;//     .local v21, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);v21=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "aid"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 144
a=0;//     if-eqz v28, :cond_3
a=0;// 
a=0;//     .line 145
a=0;//     const-string v4, "isVip"
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getIsVip()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 146
a=0;//     const-string v4, "textid"
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 147
a=0;//     const-string v4, "beg"
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getPosi()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 150
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v4, "imgFile"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 151
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 152
a=0;//     const-string v4, "WEB"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getIsFromWeb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 153
a=0;//     const/high16 v4, 0x4000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 154
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     .end local v21    # "intent":Landroid/content/Intent;
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);v21=(Uninit);
a=0;//     new-instance v21, Landroid/content/Intent;
a=0;// 
a=0;//     #v21=(UninitRef,Landroid/content/Intent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-class v7, Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0, v4, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 159
a=0;//     .restart local v21    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);v21=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "bookFile"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getBookFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 160
a=0;//     const-string v4, "finishFlag"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getFinishFlag()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 161
a=0;//     const-string v4, "aid"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 162
a=0;//     if-eqz v28, :cond_5
a=0;// 
a=0;//     .line 163
a=0;//     const-string v4, "beg"
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getPosi()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 164
a=0;//     const-string v4, "textid"
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 173
a=0;//     :goto_1
a=0;//     #v18=(Conflicted);
a=0;//     const-string v4, "imgFile"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getImgFile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 174
a=0;//     const-string v4, "WEB"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getIsFromWeb()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 175
a=0;//     const/high16 v4, 0x4000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 176
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     :cond_5
a=0;//     :try_start_0
a=0;//     #v18=(Uninit);
a=0;//     const-string v7, "textid"
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 168
a=0;//     :catch_0
a=0;//     #v8=(PosByte);
a=0;//     move-exception v18
a=0;// 
a=0;//     .line 169
a=0;//     .local v18, "e":Ljava/lang/Exception;
a=0;//     #v18=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 182
a=0;//     .end local v12    # "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v18    # "e":Ljava/lang/Exception;
a=0;//     .end local v21    # "intent":Landroid/content/Intent;
a=0;//     .end local v28    # "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :sswitch_1
a=0;//     #v4=(Integer);v7=(Uninit);v8=(Uninit);v12=(Uninit);v18=(Uninit);v21=(Uninit);v28=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v0, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     .line 183
a=0;//     .local v20, "index":I
a=0;//     #v20=(Integer);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 186
a=0;//     .local v13, "bf2":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$1(Lcom/twocloo/com/cn/fragment/BookShelfFragment;I)V
a=0;// 
a=0;//     .line 189
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     new-instance v7, Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v30
a=0;// 
a=0;//     #v30=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     #v31=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static/range {v32 .. v32}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v32
a=0;// 
a=0;//     move-object/from16 v0, v30
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v32
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v7, v8, v0, v1, v2}, Lcom/twocloo/com/cn/threads/UpdateBookThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     invoke-static {v4, v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$3(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/threads/UpdateBookThread;)V
a=0;// 
a=0;//     .line 190
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$4(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/threads/UpdateBookThread;->start()V
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v23, Landroid/os/Message;
a=0;// 
a=0;//     #v23=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct/range {v23 .. v23}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 193
a=0;//     .local v23, "msg1":Landroid/os/Message;
a=0;//     #v23=(Reference,Landroid/os/Message;);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 194
a=0;//     const/16 v4, 0x14d
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput v4, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 195
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     .end local v13    # "bf2":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v20    # "index":I
a=0;//     .end local v23    # "msg1":Landroid/os/Message;
a=0;//     :sswitch_2
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Integer);v7=(Uninit);v8=(Uninit);v13=(Uninit);v20=(Uninit);v23=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 201
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 203
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isAdded()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v4, v7, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 209
a=0;//     :sswitch_3
a=0;//     #v4=(Integer);v7=(Uninit);v8=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 210
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 212
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$6(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 215
a=0;//     .local v14, "bf3":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/utils/CommonUtils;->delCacheAfterUpbook(Lcom/twocloo/com/cn/beans/BFBook;)V
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v14, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setIsUp(I)V
a=0;// 
a=0;//     .line 219
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 220
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_9
a=0;// 
a=0;//     .line 222
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     :cond_9
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     .end local v14    # "bf3":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     :sswitch_4
a=0;//     #v4=(Integer);v7=(Uninit);v14=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->updatelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 231
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$9(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 233
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v0, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     .line 234
a=0;//     .local v26, "p":I
a=0;//     #v26=(Integer);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v15, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 236
a=0;//     .local v15, "bfbook":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     new-instance v7, Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v30
a=0;// 
a=0;//     #v30=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     #v31=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static/range {v32 .. v32}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v32
a=0;// 
a=0;//     move-object/from16 v0, v30
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v32
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v7, v8, v0, v1, v2}, Lcom/twocloo/com/cn/threads/UpdateBookThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/threads/UpdateBookThread;);
a=0;//     invoke-static {v4, v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$3(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Lcom/twocloo/com/cn/threads/UpdateBookThread;)V
a=0;// 
a=0;//     .line 237
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$4(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/UpdateBookThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/threads/UpdateBookThread;->start()V
a=0;// 
a=0;//     .line 239
a=0;//     new-instance v22, Landroid/os/Message;
a=0;// 
a=0;//     #v22=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct/range {v22 .. v22}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 240
a=0;//     .local v22, "message":Landroid/os/Message;
a=0;//     #v22=(Reference,Landroid/os/Message;);
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     iput v0, v1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     .line 241
a=0;//     const/16 v4, 0x14d
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput v4, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 242
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 243
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "\u8fdb\u5165\u540e\u53f0\u66f4\u65b0."
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v4, v7, v8}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     .end local v15    # "bfbook":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v22    # "message":Landroid/os/Message;
a=0;//     .end local v26    # "p":I
a=0;//     :sswitch_5
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Integer);v7=(Uninit);v8=(Uninit);v15=(Uninit);v22=(Uninit);v26=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$9(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 263
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     .line 265
a=0;//     .local v29, "str":Ljava/lang/String;
a=0;//     #v29=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->initBookPop(Ljava/lang/String;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     .line 266
a=0;//     .local v27, "pop":Landroid/widget/PopupWindow;
a=0;//     #v27=(Reference,Landroid/widget/PopupWindow;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$10(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v8, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v8, v8, -0xf
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v0, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v30, v0
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     add-int/lit8 v30, v30, -0xf
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v4, v7, v8, v1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$1;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$1;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$1;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;// 
a=0;//     .line 272
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$11(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/widget/PopupWindow;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     .end local v27    # "pop":Landroid/widget/PopupWindow;
a=0;//     .end local v29    # "str":Ljava/lang/String;
a=0;//     :sswitch_6
a=0;//     #v1=(Uninit);v4=(Integer);v7=(Uninit);v8=(Uninit);v27=(Uninit);v29=(Uninit);v30=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isAdded()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     .line 284
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v4, v7, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 288
a=0;//     :cond_a
a=0;//     #v4=(Boolean);v7=(Conflicted);v8=(Uninit);
a=0;//     const-string v4, "WIFI"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCurrentNetType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_c
a=0;// 
a=0;//     .line 289
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/LocalStore;->getisWifiAlarm(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne v4, v7, :cond_b
a=0;// 
a=0;//     .line 290
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     move-object/from16 v30, v0
a=0;// 
a=0;//     #v30=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const-string v4, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v5, "\u5f53\u524d\u662f\u975ewifi\u7f51\u7edc\uff0c\u662f\u5426\u4e0b\u8f7d"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const-string v7, "\u662f"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "\u5426"
a=0;// 
a=0;//     .line 291
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$2;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     invoke-direct {v9, v0, v1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$2;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;Landroid/os/Message;)V
a=0;// 
a=0;//     .line 299
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$2;);
a=0;//     new-instance v10, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$3;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$3;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v10, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$3;-><init>(Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;)V
a=0;// 
a=0;//     .line 290
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1$3;);
a=0;//     invoke-static/range {v3 .. v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v30
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$13(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Landroid/app/Dialog;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_b
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(One);v8=(Uninit);v9=(Uninit);v10=(Uninit);v30=(Uninit);
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->downbook(Landroid/os/Message;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 311
a=0;//     :cond_c
a=0;//     #v4=(Boolean);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->downbook(Landroid/os/Message;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 317
a=0;//     :sswitch_7
a=0;//     #v4=(Integer);v7=(Uninit);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v7, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 318
a=0;//     .local v16, "bookd2":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setIsonDown(I)V
a=0;// 
a=0;//     .line 319
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_e
a=0;// 
a=0;//     .line 321
a=0;//     :cond_d
a=0;//     #v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 327
a=0;//     :goto_2
a=0;//     #v7=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 324
a=0;//     :cond_e
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 331
a=0;//     .end local v16    # "bookd2":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     :sswitch_8
a=0;//     #v4=(Integer);v7=(Uninit);v16=(Uninit);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 332
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Vector;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v4, v7, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->queryMyBFData(Ljava/util/Vector;Ljava/lang/String;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sput-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     .line 333
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_10
a=0;// 
a=0;//     .line 335
a=0;//     :cond_f
a=0;//     #v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 340
a=0;//     :goto_3
a=0;//     #v7=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 341
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 338
a=0;//     :cond_10
a=0;//     #v7=(Reference,Ljava/util/Vector;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 345
a=0;//     :sswitch_9
a=0;//     #v4=(Integer);v7=(Uninit);v8=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     .line 346
a=0;//     .local v24, "n":Ljava/lang/Object;
a=0;//     #v24=(Reference,Ljava/lang/Object;);
a=0;//     const-string v25, ""
a=0;// 
a=0;//     .line 347
a=0;//     .local v25, "nn":Ljava/lang/String;
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v24, :cond_11
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     .line 350
a=0;//     :cond_11
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->isAdded()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 351
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     sget v30, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     move/from16 v0, v30
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\uff0c"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " \u4e0b\u8f7d\u5931\u8d25"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v4, v7, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     .end local v24    # "n":Ljava/lang/Object;
a=0;//     .end local v25    # "nn":Ljava/lang/String;
a=0;//     :sswitch_a
a=0;//     #v4=(Integer);v7=(Uninit);v8=(Uninit);v24=(Uninit);v25=(Uninit);v30=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$15(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getVersionCode()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 356
a=0;//     .local v5, "code":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$15(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getIsforce()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 357
a=0;//     .local v9, "isforce":Z
a=0;//     #v9=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$15(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getWrongversion()[I
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 358
a=0;//     .local v10, "wrongversion":[I
a=0;//     #v10=(Reference,[I);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$15(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getAppurl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 359
a=0;//     .local v6, "apkurl":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$15(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/threads/BanbenxinThread;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/threads/BanbenxinThread;->bbxx:Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->getFeatures()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 360
a=0;//     .local v11, "arr":[Ljava/lang/String;
a=0;//     #v11=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v17, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 361
a=0;//     .local v17, "buffer":Ljava/lang/StringBuffer;
a=0;//     #v17=(Reference,Ljava/lang/StringBuffer;);
a=0;//     if-eqz v11, :cond_12
a=0;// 
a=0;//     array-length v4, v11
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_12
a=0;// 
a=0;//     .line 362
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .local v19, "i":I
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);v19=(Integer);
a=0;//     array-length v4, v11
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_13
a=0;// 
a=0;//     .line 369
a=0;//     .end local v19    # "i":I
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v4=(Conflicted);v19=(Conflicted);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v3 .. v10}, Lcom/twocloo/com/cn/http/MyAutoUpdate;-><init>(Landroid/app/Activity;ILjava/lang/String;ZLjava/lang/String;Z[I)V
a=0;// 
a=0;//     .line 370
a=0;//     .local v3, "update":Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->check()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 363
a=0;//     .end local v3    # "update":Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;//     .restart local v19    # "i":I
a=0;//     :cond_13
a=0;//     #v0=(Integer);v3=(Uninit);v4=(Integer);v7=(Conflicted);v8=(Uninit);v19=(Integer);
a=0;//     aget-object v4, v11, v19
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-eqz v4, :cond_14
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aget-object v7, v11, v19
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_14
a=0;// 
a=0;//     .line 364
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     add-int/lit8 v7, v19, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u3001"
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aget-object v7, v11, v19
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 362
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v19, v19, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 373
a=0;//     .end local v5    # "code":I
a=0;//     .end local v6    # "apkurl":Ljava/lang/String;
a=0;//     .end local v9    # "isforce":Z
a=0;//     .end local v10    # "wrongversion":[I
a=0;//     .end local v11    # "arr":[Ljava/lang/String;
a=0;//     .end local v17    # "buffer":Ljava/lang/StringBuffer;
a=0;//     .end local v19    # "i":I
a=0;//     :sswitch_b
a=0;//     #v0=(Reference,Landroid/os/Message;);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v17=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$16(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_15
a=0;// 
a=0;//     .line 374
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$16(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 375
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "\u540c\u6b65\u4e66\u67b6\u5b8c\u6210\uff01"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v4, v7, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 378
a=0;//     :cond_15
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v4, "\u901a\u77e5\u4e66\u67b6\u66f4\u65b0"
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 379
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 382
a=0;//     sget-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 383
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$14(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Vector;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     #v30=(Null);
a=0;//     const/16 v31, 0x14
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     move/from16 v0, v30
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v4, v7, v8, v0, v1}, Lcom/twocloo/com/cn/db/DBAdapter;->queryMyBFData(Ljava/util/Vector;Ljava/lang/String;II)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sput-object v4, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     .line 384
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;);
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$10(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Lcom/twocloo/com/cn/view/PullRefreshListView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/view/PullRefreshListView;->onRefreshComplete()V
a=0;// 
a=0;//     .line 387
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/BaseAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 388
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getList()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_17
a=0;// 
a=0;//     .line 390
a=0;//     :cond_16
a=0;//     #v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 395
a=0;//     :goto_5
a=0;//     #v7=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     sget-object v7, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Vector;);
a=0;//     invoke-static {v4, v7}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$17(Lcom/twocloo/com/cn/fragment/BookShelfFragment;Ljava/util/Vector;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 393
a=0;//     :cond_17
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookShelfFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 398
a=0;//     :sswitch_c
a=0;//     #v1=(Uninit);v4=(Integer);v7=(Uninit);v8=(Uninit);v30=(Uninit);v31=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     instance-of v4, v4, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 399
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/fragment/BookShelfFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/BookShelfFragment;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/fragment/BookShelfFragment;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/MainActivity;->tabs:Landroid/widget/RadioGroup;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/RadioGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->performClick()Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);v32=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_a
a=0;//         0x2 -> :sswitch_b
a=0;//         0x3 -> :sswitch_c
a=0;//         0xc -> :sswitch_4
a=0;//         0xd -> :sswitch_5
a=0;//         0xf -> :sswitch_6
a=0;//         0x10 -> :sswitch_7
a=0;//         0x11 -> :sswitch_8
a=0;//         0x12 -> :sswitch_9
a=0;//         0x14d -> :sswitch_0
a=0;//         0x14e -> :sswitch_1
a=0;//         0x14f -> :sswitch_2
a=0;//         0x150 -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// .end method
}}
