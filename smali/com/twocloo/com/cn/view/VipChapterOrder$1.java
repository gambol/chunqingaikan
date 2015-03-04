package com.twocloo.com.cn.view; class VipChapterOrder$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/VipChapterOrder$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "VipChapterOrder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/VipChapterOrder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 5
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     #v4=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "type":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v1=(One);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_2
a=0;//     #v1=(PosByte);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/VipChapterOrder$1;->this$0:Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/view/VipChapterOrder;->access$0(Lcom/twocloo/com/cn/view/VipChapterOrder;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->vip_reading_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
