package com.twocloo.com.cn.common; class ReadBookShareListener$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/ReadBookShareListener$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ReadBookShareListener.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/text/TextWatcher;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/ReadBookShareListener;->addListener()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private temp:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public afterTextChanged(Landroid/text/Editable;)V
a=0;//     .locals 4
a=0;//     .param p1, "s"    # Landroid/text/Editable;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     .line 109
a=0;//     #v3=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->temp:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v3, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->access$0(Lcom/twocloo/com/cn/common/ReadBookShareListener;)Lcom/twocloo/base/openapi/QZoneAble;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u4f60\u8f93\u5165\u7684\u5b57\u6570\u5df2\u7ecf\u8d85\u8fc7\u4e86\u9650\u5236\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->access$2(Lcom/twocloo/com/cn/common/ReadBookShareListener;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/text/Editable;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1, v3, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->access$2(Lcom/twocloo/com/cn/common/ReadBookShareListener;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->access$2(Lcom/twocloo/com/cn/common/ReadBookShareListener;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/text/Editable;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public beforeTextChanged(Ljava/lang/CharSequence;III)V
a=0;//     .locals 0
a=0;//     .param p1, "s"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "count"    # I
a=0;//     .param p4, "after"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->temp:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTextChanged(Ljava/lang/CharSequence;III)V
a=0;//     .locals 5
a=0;//     .param p1, "s"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "before"    # I
a=0;//     .param p4, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/ReadBookShareListener;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->access$0(Lcom/twocloo/com/cn/common/ReadBookShareListener;)Lcom/twocloo/base/openapi/QZoneAble;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->last_read_share_content_limit:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/openapi/QZoneAble;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     rsub-int/lit8 v4, v4, 0x64
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "shareContentLimit":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/ReadBookShareListener$1;->this$0:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->access$1(Lcom/twocloo/com/cn/common/ReadBookShareListener;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
}}
