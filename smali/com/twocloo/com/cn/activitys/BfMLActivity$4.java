package com.twocloo.com.cn.activitys; class BfMLActivity$4 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/BfMLActivity$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BfMLActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/RadioGroup$OnCheckedChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/BfMLActivity;->initviews()V
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     .line 221
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
a=0;//     .locals 5
a=0;//     .param p1, "group"    # Landroid/widget/RadioGroup;
a=0;//     .param p2, "checkedId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 224
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_3
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_black_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 231
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
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
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0, p2}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$18(Lcom/twocloo/com/cn/activitys/BfMLActivity;I)V
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$19(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$20(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 229
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne p2, v0, :cond_1
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_black_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 244
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$16(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0, p2}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$18(Lcom/twocloo/com/cn/activitys/BfMLActivity;I)V
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$20(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$19(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 242
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/BfMLActivity$4;->this$0:Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/BfMLActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/BfMLActivity;->access$17(Lcom/twocloo/com/cn/activitys/BfMLActivity;)Landroid/widget/RadioButton;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->tab_button_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
