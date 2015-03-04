package com.twocloo.com.cn.activitys; class ManageBookShelf$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;
a=0;// .super Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// .source "ManageBookShelf.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//         "<",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     .line 332
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/singlebook/DataCallBack;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callBack(Ljava/lang/Boolean;)V
a=0;//     .locals 4
a=0;//     .param p1, "t"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 336
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->adapter:Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/adapters/ManageBookShelfAdapter;->notifyDataSetChangedDefault()V
a=0;// 
a=0;//     .line 340
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iput v3, v0, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->deleteCount:I
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$2(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->access$2(Lcom/twocloo/com/cn/activitys/ManageBookShelf;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getResources()Landroid/content/res/Resources;
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
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_delete_success:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 346
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 352
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 348
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->this$0:Lcom/twocloo/com/cn/activitys/ManageBookShelf;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ManageBookShelf;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->arrange_bookshelf_delete_failed:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/activitys/ManageBookShelf;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 349
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic callBack(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/activitys/ManageBookShelf$2;->callBack(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
