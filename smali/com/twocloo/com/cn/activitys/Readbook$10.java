package com.twocloo.com.cn.activitys; class Readbook$10 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$10;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook;->showDL()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 1404
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$10;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 6
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1407
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v4, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$16(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 1408
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     .line 1409
a=0;//     .local v2, "uid":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$29(Lcom/twocloo/com/cn/activitys/Readbook;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 1410
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1411
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1414
a=0;//     :cond_0
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     const-string v5, "\u6dfb\u52a0\u6210\u529f"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1415
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$30(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1416
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$30(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1418
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$30(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v5, v5, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 1419
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 1420
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$31(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 1421
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$31(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1425
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1426
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$17(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1427
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1428
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getFinishflag()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 1429
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setIsFromWeb(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1430
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$30(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 1432
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$17(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v3, v4, v5}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1433
a=0;//     .local v1, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 1434
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1437
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->finish()V
a=0;// 
a=0;//     .line 1438
a=0;//     return-void
a=0;// 
a=0;//     .line 1423
a=0;//     .restart local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);v1=(Uninit);v3=(Null);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/Readbook$10;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$32(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}