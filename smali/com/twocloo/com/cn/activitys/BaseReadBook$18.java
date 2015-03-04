package com.twocloo.com.cn.activitys; class BaseReadBook$18 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BaseReadBook$18;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseReadBook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/RadioGroup$OnCheckedChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BaseReadBook;->setRadioInit()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     .line 1042
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook$18;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
a=0;//     .locals 6
a=0;//     .param p1, "group"    # Landroid/widget/RadioGroup;
a=0;//     .param p2, "checkedId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1044
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg1:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_1
a=0;// 
a=0;//     .line 1046
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg1:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1047
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iput v1, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->nowbgid:I
a=0;// 
a=0;//     .line 1048
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->cgbg(I)V
a=0;// 
a=0;//     .line 1049
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/PageWidget;->cgbg(I)V
a=0;// 
a=0;//     .line 1050
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrbg(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1051
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$12(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;// 
a=0;//     .line 1052
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     .line 1100
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg2:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_2
a=0;// 
a=0;//     .line 1055
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg2:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1056
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iput v2, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->nowbgid:I
a=0;// 
a=0;//     .line 1057
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->cgbg(I)V
a=0;// 
a=0;//     .line 1058
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/view/PageWidget;->cgbg(I)V
a=0;// 
a=0;//     .line 1059
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setMrbg(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1060
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$12(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;// 
a=0;//     .line 1061
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1063
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg3:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_3
a=0;// 
a=0;//     .line 1064
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg3:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1065
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iput v3, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->nowbgid:I
a=0;// 
a=0;//     .line 1066
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->cgbg(I)V
a=0;// 
a=0;//     .line 1067
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/view/PageWidget;->cgbg(I)V
a=0;// 
a=0;//     .line 1068
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setMrbg(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1069
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$12(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;// 
a=0;//     .line 1070
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1072
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg4:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_4
a=0;// 
a=0;//     .line 1073
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg4:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1074
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iput v4, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->nowbgid:I
a=0;// 
a=0;//     .line 1075
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/view/BookPageFactory;->cgbg(I)V
a=0;// 
a=0;//     .line 1076
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/view/PageWidget;->cgbg(I)V
a=0;// 
a=0;//     .line 1077
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setMrbg(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1078
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$12(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;// 
a=0;//     .line 1079
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1081
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg5:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_5
a=0;// 
a=0;//     .line 1082
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg5:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1083
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iput v5, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->nowbgid:I
a=0;// 
a=0;//     .line 1084
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/view/BookPageFactory;->cgbg(I)V
a=0;// 
a=0;//     .line 1085
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/view/PageWidget;->cgbg(I)V
a=0;// 
a=0;//     .line 1086
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0, v5}, Lcom/twocloo/com/cn/common/LocalStore;->setMrbg(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1087
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$12(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;// 
a=0;//     .line 1088
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1090
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg6:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 1091
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->rdbg6:Landroid/widget/RadioButton;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1092
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BaseReadBook;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->nowbgid:I
a=0;// 
a=0;//     .line 1093
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->cgbg(I)V
a=0;// 
a=0;//     .line 1094
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/activitys/BaseReadBook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/PageWidget;->cgbg(I)V
a=0;// 
a=0;//     .line 1095
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrbg(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1096
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->access$12(Lcom/twocloo/com/cn/activitys/BaseReadBook;)V
a=0;// 
a=0;//     .line 1097
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BaseReadBook$18;->this$0:Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
