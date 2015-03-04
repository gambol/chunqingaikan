package com.twocloo.com.cn.common; class JavaScript$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/JavaScript$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "JavaScript.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/common/JavaScript;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript$1;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     .line 127
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 6
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 129
a=0;//     #v5=(One);
a=0;//     iget v3, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 130
a=0;//     .local v0, "code":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     .local v2, "message":Ljava/lang/String;
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript$1;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 133
a=0;//     const-string v3, "\u5956\u52b1\u5151\u6362\u6210\u529f"
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript$1;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 135
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 136
a=0;//     const-string v3, "type"
a=0;// 
a=0;//     const-string v4, "duijiang"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript$1;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 144
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Reference,Ljava/lang/Integer;);v4=(Uninit);
a=0;//     if-ne v0, v5, :cond_2
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript$1;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\u9080\u8bf7\u4ebaID\u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :cond_2
a=0;//     #v4=(Uninit);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript$1;->this$0:Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/JavaScript;->access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\u9080\u8bf7\u4ebaID\u5fc5\u987b\u5168\u90e8\u4e3a\u6570\u5b57\uff0c\u4e0d\u80fd\u5305\u542b\u5176\u5b83\u5b57\u7b26"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
