package com.twocloo.com.cn.activitys; class UpdateMiMa { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// .super Landroid/app/Activity;
a=0;// .source "UpdateMiMa.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "UpdateMiMa"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private confirmPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private confirmpasswordTv:Ljava/lang/String;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line3:Landroid/view/View;
a=0;// 
a=0;// .field private line4:Landroid/view/View;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private modifyComplete:Landroid/widget/Button;
a=0;// 
a=0;// .field private newPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;// .field private oldpasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private oldpasswordTv:Ljava/lang/String;
a=0;// 
a=0;// .field private rl:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titleTv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topbarlayot:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private username:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;-><init>(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initview()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 109
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 110
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line3:Landroid/view/View;
a=0;// 
a=0;//     .line 111
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line4:Landroid/view/View;
a=0;// 
a=0;//     .line 112
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->topbarlayot:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 113
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 114
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->update_oldcode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 115
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->update_newcode1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 116
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->update_newcode2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 117
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->update_over:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->modifyComplete:Landroid/widget/Button;
a=0;// 
a=0;//     .line 118
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 119
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->modifyComplete:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 125
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->finish()V
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->update_over:I
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 133
a=0;//     const-string v1, "\u8bf7\u8f93\u5165\u60a8\u7684\u539f\u59cb\u5bc6\u7801\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 158
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 136
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Integer);v3=(One);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 137
a=0;//     const-string v1, "\u8bf7\u8f93\u5165\u60a8\u7684\u65b0\u5bc6\u7801\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 141
a=0;//     const-string v1, "\u8bf7\u518d\u6b21\u8f93\u5165\u65b0\u5bc6\u7801\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     if-le v1, v2, :cond_6
a=0;// 
a=0;//     .line 145
a=0;//     :cond_5
a=0;//     const-string v1, "\u5bc6\u7801\u957f\u5ea6\u5fc5\u987b\u662f6~16\u4f4d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_6
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 149
a=0;//     const-string v1, "\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->confirmPasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 154
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/UpdateCodeThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/UpdateCodeThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->newpasswordTv:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, p0, v1, v2, v3}, Lcom/twocloo/com/cn/threads/UpdateCodeThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 155
a=0;//     .local v0, "updatepasswordThread":Lcom/twocloo/com/cn/threads/UpdateCodeThread;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/UpdateCodeThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/UpdateCodeThread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 83
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 84
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->updatemima:I
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->setContentView(I)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->initview()V
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->oldpasswordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/Util;->showSoftKeyBoard(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->finish()V
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 186
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 187
a=0;//     const-string v0, "UpdateMiMa"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 170
a=0;//     const-string v0, "UpdateMiMa"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->setTopLayout()V
a=0;// 
a=0;//     .line 173
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->topbarlayot:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->line4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 199
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->topbarlayot:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
}}
