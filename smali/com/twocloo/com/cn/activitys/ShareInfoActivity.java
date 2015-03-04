package com.twocloo.com.cn.activitys; class ShareInfoActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/ShareInfoActivity;
a=0;// .super Lcom/twocloo/base/openapi/QZoneAble;
a=0;// .source "ShareInfoActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MAX_TEXT_SIZE:I = 0x64
a=0;// 
a=0;// .field private static final SINA_SHARE_CODE:I = 0x2711
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ShareInfoActivity"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private SHARE_URL:Ljava/lang/String;
a=0;// 
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private aid:Ljava/lang/String;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field protected booklogo:Ljava/lang/String;
a=0;// 
a=0;// .field protected bookname:Ljava/lang/String;
a=0;// 
a=0;// .field private cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private chapterName:Ljava/lang/String;
a=0;// 
a=0;// .field protected description:Ljava/lang/String;
a=0;// 
a=0;// .field private editText:Landroid/widget/EditText;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private shareQQ:Landroid/widget/Button;
a=0;// 
a=0;// .field private shareSina:Landroid/widget/Button;
a=0;// 
a=0;// .field private shareToSNS:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;// .field private sharetype:Ljava/lang/String;
a=0;// 
a=0;// .field protected sortname:Ljava/lang/String;
a=0;// 
a=0;// .field private textView:Landroid/widget/TextView;
a=0;// 
a=0;// .field protected thumb:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private titletv:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/openapi/QZoneAble;-><init>()V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 67
a=0;//     const-string v0, "http://t.2cloo.com/book/"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->SHARE_URL:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     .line 155
a=0;//     #v2=(PosByte);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 156
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->title_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 157
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 158
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 159
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->last_read_page_share_content_count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->textView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 160
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->last_read_page_share_content:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 161
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_book_share_qq_button:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareQQ:Landroid/widget/Button;
a=0;// 
a=0;//     .line 162
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_book_share_sina_button:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareSina:Landroid/widget/Button;
a=0;// 
a=0;//     .line 163
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->cancle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->sharetype:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "sina"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareQQ:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u5206\u4eab"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->titletv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->getResources()Landroid/content/res/Resources;
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
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareSina:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareQQ:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// 
a=0;//     .line 167
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->sharetype:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "qq"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareSina:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 0
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/twocloo/base/openapi/QZoneAble;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 223
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->finish()V
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareSina:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->cancleBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/base/openapi/QZoneAble;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 83
a=0;//     sget v1, Lcom/twocloo/com/cn/R$layout;->read_book_share_tools_dialog:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 84
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "it":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     const-string v1, "share_type"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->sharetype:Ljava/lang/String;
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v1, p0, v2, v3}, Lcom/twocloo/com/cn/common/ShareToSNS;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->shareToSNS:Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->init()V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, v1, v2}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 152
a=0;//     :goto_0
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;);
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     const-string v1, "\u8f7d\u5165\u4e2d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/ShareInfoActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ShareInfoActivity$2;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 151
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onDestroy()V
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onPause()V
a=0;// 
a=0;//     .line 237
a=0;//     const-string v0, "ShareInfoActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 238
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onResume()V
a=0;// 
a=0;//     .line 227
a=0;//     const-string v0, "ShareInfoActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->titlelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 232
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareContent(Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "bookName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     #v5=(Null);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->readbook_share_content:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u300a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\u300b"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 193
a=0;//     .local v0, "shareContent":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-array v3, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p1, v3, v5
a=0;// 
a=0;//     invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->SHARE_URL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "/?app_share=1"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ShareInfoActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/text/Editable;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V
a=0;// 
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
}}
