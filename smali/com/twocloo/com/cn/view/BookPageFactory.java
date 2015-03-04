package com.twocloo.com.cn.view; class BookPageFactory { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookPageFactory.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEF_FOND_SIZE_INDEX:I = 0x1
a=0;// 
a=0;// .field public static final MARGIT_TO:I = 0x78
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private book_file:Ljava/io/File;
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private df:Ljava/text/DecimalFormat;
a=0;// 
a=0;// .field private ff:Z
a=0;// 
a=0;// .field private fontCode:I
a=0;// 
a=0;// .field private isNewChapter:Z
a=0;// 
a=0;// .field private jpTex:Landroid/widget/TextView;
a=0;// 
a=0;// .field private linePaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mHeight:I
a=0;// 
a=0;// .field private mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mVisibleHeight:F
a=0;// 
a=0;// .field private mVisibleWidth:F
a=0;// 
a=0;// .field private mWidth:I
a=0;// 
a=0;// .field private m_fontSize:I
a=0;// 
a=0;// .field public m_isfirstPage:Z
a=0;// 
a=0;// .field public m_islastPage:Z
a=0;// 
a=0;// .field private m_lines:Ljava/util/Vector;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;// .field public m_mbBufBegin:I
a=0;// 
a=0;// .field public m_mbBufEnd:I
a=0;// 
a=0;// .field public m_mbBufLen:I
a=0;// 
a=0;// .field private m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;// .field private mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private marginHeight:I
a=0;// 
a=0;// .field private marginWidth:I
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private pt:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;// .field public textColorList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private textSize:[I
a=0;// 
a=0;// .field private title:Ljava/lang/String;
a=0;// 
a=0;// .field public topTextColorList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private wh:[I
a=0;// 
a=0;// .field private xingkaiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;// .field private xinweiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;// .field private zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;III)V
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "w"    # I
a=0;//     .param p3, "h"    # I
a=0;//     .param p4, "fontSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     .line 47
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     .line 50
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput-boolean v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->isNewChapter:Z
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v5, Ljava/util/Vector;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v5}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getFont1()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aput v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getFont2()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     aput v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getFont3()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     aput v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getFont4()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     aput v7, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getFont5()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     aput v7, v5, v6
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->topTextColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 64
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextLeftRightSize()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     .line 65
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextTopBottomSize()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginHeight:I
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v5, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v6, "00.0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->df:Ljava/text/DecimalFormat;
a=0;// 
a=0;//     .line 115
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$array;->zwcolor:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 119
a=0;//     .local v3, "str1":[Ljava/lang/String;
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$array;->orcolor:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 120
a=0;//     .local v4, "str2":[Ljava/lang/String;
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v6=(Conflicted);
a=0;//     array-length v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v2, v5, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mWidth:I
a=0;// 
a=0;//     .line 128
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mHeight:I
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint$Align;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget v6, v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint$Align;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget v6, v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint$Align;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget v6, v6, v7
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setFakeBoldText(Z)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 149
a=0;//     .local v1, "fm":Landroid/graphics/Paint$FontMetrics;
a=0;//     #v1=(Reference,Landroid/graphics/Paint$FontMetrics;);
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->linePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->linePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->linePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     const/high16 v6, 0x40400000    # 3.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->linePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 154
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextFontSpaceSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "a":I
a=0;//     #v0=(Integer);
a=0;//     iget v5, v1, Landroid/graphics/Paint$FontMetrics;->descent:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     int-to-float v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     add-float/2addr v5, v6
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     .line 159
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint$Align;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextTitleFondSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->topTextColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 165
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mWidth:I
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/lit8 v6, v6, 0x2
a=0;// 
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleWidth:F
a=0;// 
a=0;//     .line 166
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginHeight:I
a=0;// 
a=0;//     mul-int/lit8 v6, v6, 0x2
a=0;// 
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleHeight:F
a=0;// 
a=0;//     move-object v5, p1
a=0;// 
a=0;//     .line 169
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     check-cast v5, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/PhoneUtils;->getScreenPix(Landroid/app/Activity;)[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->wh:[I
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/common/LocalStore;->gettextFont(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->fontCode:I
a=0;// 
a=0;//     .line 171
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->fontCode:I
a=0;// 
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 122
a=0;//     .end local v0    # "a":I
a=0;//     .end local v1    # "fm":Landroid/graphics/Paint$FontMetrics;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v5=(Integer);v7=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     aget-object v6, v3, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->topTextColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     aget-object v6, v4, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 120
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     .restart local v0    # "a":I
a=0;//     .restart local v1    # "fm":Landroid/graphics/Paint$FontMetrics;
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Reference,Landroid/graphics/Paint$FontMetrics;);v5=(Integer);v6=(Integer);v7=(Null);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->fontCode:I
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_3
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xingkaiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Typeface;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xingkaiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xingkaiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 179
a=0;//     :cond_3
a=0;//     #v5=(Integer);v6=(One);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->fontCode:I
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xinweiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Typeface;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xinweiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xinweiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;IIILandroid/widget/SeekBar;Landroid/widget/TextView;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "w"    # I
a=0;//     .param p3, "h"    # I
a=0;//     .param p4, "fontSize"    # I
a=0;//     .param p5, "readjpseek"    # Landroid/widget/SeekBar;
a=0;//     .param p6, "jpTex"    # Landroid/widget/TextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/view/BookPageFactory;-><init>(Landroid/content/Context;III)V
a=0;// 
a=0;//     .line 99
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     .line 100
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->jpTex:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 815
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 816
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 817
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageUp()V
a=0;// 
a=0;//     .line 819
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageDown()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     .line 820
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cgbg(I)V
a=0;//     .locals 0
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 829
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->p:I
a=0;// 
a=0;//     .line 831
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public destry()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 837
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 838
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 839
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/MappedByteBuffer;->clear()Ljava/nio/Buffer;
a=0;// 
a=0;//     .line 840
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     .line 842
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/nio/MappedByteBuffer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getJJ()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 293
a=0;//     #v3=(One);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 295
a=0;//     .local v0, "buff":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v3, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 299
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 301
a=0;//     .end local v0    # "buff":Ljava/lang/StringBuffer;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Conflicted);v2=(Uninit);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initFonts()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 852
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/huawenxingkai.ttf"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xingkaiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 853
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/huawenxinwei.ttf"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->xinweiTypeface:Landroid/graphics/Typeface;
a=0;// 
a=0;//     .line 854
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isfirstPage()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_isfirstPage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public islastPage()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 730
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public jump(I)V
a=0;//     .locals 0
a=0;//     .param p1, "p"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 784
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 786
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->c()V
a=0;// 
a=0;//     .line 787
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public jumpRight()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 804
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit16 v2, v2, 0x3e8
a=0;// 
a=0;//     add-int v0, v1, v2
a=0;// 
a=0;//     .line 805
a=0;//     .local v0, "v":I
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 806
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .line 807
a=0;//     :cond_0
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 808
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->c()V
a=0;// 
a=0;//     .line 809
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public jumpleft()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 793
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit16 v2, v2, 0x3e8
a=0;// 
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     .line 794
a=0;//     .local v0, "v":I
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 795
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 796
a=0;//     :cond_0
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 797
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->c()V
a=0;// 
a=0;//     .line 798
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public last()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 769
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 771
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageUp()V
a=0;// 
a=0;//     .line 773
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageDown()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     .line 774
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public nextPage()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 557
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     .line 567
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 560
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     .line 563
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 564
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 566
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageDown()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 18
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     const-string v1, "onDraw"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 572
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 690
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 575
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->p:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 576
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->textColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->p:I
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 577
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->topTextColorList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->p:I
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 580
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_3
a=0;// 
a=0;//     .line 581
a=0;//     const-string v1, "image_cache_key_pagewidget_bg_%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->p:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 582
a=0;//     .local v12, "key":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/base/cache/lru/BMemCache;->getInstance()Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/base/cache/lru/BMemCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 583
a=0;//     .local v7, "cacheBM":Landroid/graphics/Bitmap;
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 590
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/common/Constants;->READ_BG_LIST:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->p:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     .line 599
a=0;//     .end local v7    # "cacheBM":Landroid/graphics/Bitmap;
a=0;//     .end local v12    # "key":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Conflicted);v7=(Conflicted);v12=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 600
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageDown()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     .line 604
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     if-lt v1, v2, :cond_a
a=0;// 
a=0;//     .line 605
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     .line 610
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     .line 612
a=0;//     const/16 v16, 0x12
a=0;// 
a=0;//     .line 613
a=0;//     .local v16, "y":I
a=0;//     #v16=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 614
a=0;//     .local v11, "i":I
a=0;//     #v11=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Integer);v14=(Conflicted);v16=(Integer);v17=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     .line 658
a=0;//     .end local v11    # "i":I
a=0;//     .end local v16    # "y":I
a=0;//     :cond_5
a=0;//     #v1=(Integer);v11=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     int-to-double v1, v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     const-wide/high16 v3, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     mul-double/2addr v1, v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     div-double/2addr v1, v3
a=0;// 
a=0;//     double-to-float v9, v1
a=0;// 
a=0;//     .line 661
a=0;//     .local v9, "fPercent":F
a=0;//     #v9=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/SeekBar;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 662
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V
a=0;// 
a=0;//     .line 665
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u672c\u7ae0 "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->df:Ljava/text/DecimalFormat;
a=0;// 
a=0;//     const/high16 v3, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "%"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 668
a=0;//     .local v15, "strPercent":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 669
a=0;//     const-string v15, "\u672c\u7ae0 100%"
a=0;// 
a=0;//     .line 673
a=0;//     :cond_7
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->jpTex:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 674
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->jpTex:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 678
a=0;//     :cond_8
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v1, v15}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int v13, v1, v2
a=0;// 
a=0;//     .line 681
a=0;//     .local v13, "nPercentWidth":I
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mWidth:I
a=0;// 
a=0;//     sub-int/2addr v1, v13
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mHeight:I
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextTimeBottomSpaceSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v15, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 684
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/DateUtils;->formatHM(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextTimeBottomSpaceSize()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->pt:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 687
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->title:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->title:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 594
a=0;//     .end local v9    # "fPercent":F
a=0;//     .end local v13    # "nPercentWidth":I
a=0;//     .end local v15    # "strPercent":Ljava/lang/String;
a=0;//     .restart local v7    # "cacheBM":Landroid/graphics/Bitmap;
a=0;//     .restart local v12    # "key":Ljava/lang/String;
a=0;//     :cond_9
a=0;//     #v1=(Boolean);v3=(Null);v5=(Uninit);v6=(Uninit);v7=(Reference,Landroid/graphics/Bitmap;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Reference,Ljava/lang/String;);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v7, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 607
a=0;//     .end local v7    # "cacheBM":Landroid/graphics/Bitmap;
a=0;//     .end local v12    # "key":Ljava/lang/String;
a=0;//     :cond_a
a=0;//     #v1=(Integer);v2=(Integer);v3=(Integer);v4=(Conflicted);v7=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 614
a=0;//     .restart local v11    # "i":I
a=0;//     .restart local v16    # "y":I
a=0;//     :cond_b
a=0;//     #v1=(Boolean);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Integer);v14=(Conflicted);v16=(Integer);v17=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Ljava/lang/String;
a=0;// 
a=0;//     .line 617
a=0;//     .local v14, "strLine":Ljava/lang/String;
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/utils/BookPageUtils;->checkIsParaEnd(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 618
a=0;//     add-int/lit8 v16, v16, 0xd
a=0;// 
a=0;//     .line 621
a=0;//     :cond_c
a=0;//     invoke-virtual {v14}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v3, :cond_d
a=0;// 
a=0;//     .line 629
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     .line 631
a=0;//     add-int/lit8 v16, v16, 0x14
a=0;// 
a=0;//     .line 632
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 653
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 621
a=0;//     :cond_d
a=0;//     #v1=(Integer);v2=(Reference,[C);v3=(Integer);
a=0;//     aget-char v8, v2, v1
a=0;// 
a=0;//     .line 622
a=0;//     .local v8, "cr":C
a=0;//     #v8=(Char);
a=0;//     const v4, 0xfffd
a=0;// 
a=0;//     #v4=(Char);
a=0;//     if-ne v8, v4, :cond_e
a=0;// 
a=0;//     .line 623
a=0;//     const-string v4, "onDraw|\u66ff\u6362\u4e71\u7801"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 625
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v14, v8, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 621
a=0;//     :cond_e
a=0;//     #v4=(Char);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 633
a=0;//     .end local v8    # "cr":C
a=0;//     :cond_f
a=0;//     #v1=(Boolean);v4=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_10
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->ff:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_10
a=0;// 
a=0;//     .line 635
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int v16, v16, v1
a=0;// 
a=0;//     .line 636
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 637
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->ff:Z
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 638
a=0;//     :cond_10
a=0;//     #v1=(Integer);v2=(Reference,[C);v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     if-nez v1, :cond_11
a=0;// 
a=0;//     if-nez v11, :cond_11
a=0;// 
a=0;//     .line 640
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     add-int v16, v16, v1
a=0;// 
a=0;//     .line 641
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getFontsize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 642
a=0;//     .local v10, "fontsize":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     aget v2, v2, v10
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const v3, 0x3f8ccccd    # 1.1f
a=0;// 
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 643
a=0;//     const-string v1, ""
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 644
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 646
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     const/high16 v2, 0x40e00000    # 7.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V
a=0;// 
a=0;//     .line 647
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v2, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-int/lit8 v1, v16, 0x1e
a=0;// 
a=0;//     int-to-float v3, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleWidth:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v1, v16, 0x1e
a=0;// 
a=0;//     int-to-float v5, v1
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 650
a=0;//     .end local v10    # "fontsize":I
a=0;//     :cond_11
a=0;//     #v1=(Integer);v2=(Reference,[C);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     add-int v16, v16, v1
a=0;// 
a=0;//     .line 651
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginWidth:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public openbook(Ljava/io/File;)V
a=0;//     .locals 6
a=0;//     .param p1, "f"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 215
a=0;//     .local v4, "lLen":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-int v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v0, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "r"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     .line 217
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openbook(Ljava/io/File;I)V
a=0;//     .locals 1
a=0;//     .param p1, "f"    # Ljava/io/File;
a=0;//     .param p2, "beg"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;IZ)V
a=0;// 
a=0;//     .line 235
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openbook(Ljava/io/File;III)V
a=0;//     .locals 6
a=0;//     .param p1, "f"    # Ljava/io/File;
a=0;//     .param p2, "beg"    # I
a=0;//     .param p3, "start"    # I
a=0;//     .param p4, "size"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u6253\u5f00\u6570\u636e\u6587\u4ef6|"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ";start:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ";size:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 277
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     .line 278
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     .line 279
a=0;//     new-instance v0, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     const-string v2, "r"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
a=0;// 
a=0;//     int-to-long v2, p3
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     int-to-long v4, p4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     .line 280
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V
a=0;// 
a=0;//     .line 285
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openbook(Ljava/io/File;IZ)V
a=0;//     .locals 6
a=0;//     .param p1, "f"    # Ljava/io/File;
a=0;//     .param p2, "beg"    # I
a=0;//     .param p3, "ff"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iput-boolean p3, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->ff:Z
a=0;// 
a=0;//     .line 250
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 252
a=0;//     .local v4, "lLen":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-int v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     .line 253
a=0;//     new-instance v0, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "r"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     .line 254
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V
a=0;// 
a=0;//     .line 259
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openbook(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "strFilePath"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 196
a=0;//     .local v4, "lLen":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-int v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v0, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->book_file:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "r"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     .line 198
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V
a=0;// 
a=0;//     .line 203
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected pageDown()Ljava/util/Vector;
a=0;//     .locals 14
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     .line 378
a=0;//     #v13=(Byte);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     .line 379
a=0;//     .local v6, "strParagraph":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/util/Vector;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v3}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     .line 380
a=0;//     .local v3, "lines":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
a=0;//     #v3=(Reference,Ljava/util/Vector;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     .local v0, "curHeight":I
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     .local v2, "fir":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     int-to-float v9, v0
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleHeight:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     cmpg-float v9, v9, v10
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_0
a=0;// 
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     if-lt v9, v10, :cond_1
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     return-object v3
a=0;// 
a=0;//     .line 386
a=0;//     :cond_1
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     invoke-virtual {p0, v9}, Lcom/twocloo/com/cn/view/BookPageFactory;->readParagraphForward(I)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 388
a=0;//     .local v5, "paraBuf":[B
a=0;//     #v5=(Reference,[B);
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     array-length v10, v5
a=0;// 
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     .line 391
a=0;//     add-int/lit8 v0, v0, 0xd
a=0;// 
a=0;//     .line 393
a=0;//     :try_start_0
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v5, v9}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .end local v6    # "strParagraph":Ljava/lang/String;
a=0;//     .local v7, "strParagraph":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 398
a=0;//     .end local v7    # "strParagraph":Ljava/lang/String;
a=0;//     .restart local v6    # "strParagraph":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     .line 399
a=0;//     .local v8, "strReturn":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eq v9, v13, :cond_6
a=0;// 
a=0;//     .line 401
a=0;//     const-string v8, "\r\n"
a=0;// 
a=0;//     .line 402
a=0;//     const-string v9, "\r\n"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 410
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 412
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 415
a=0;//     :try_start_1
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v10}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 428
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gtz v9, :cond_8
a=0;// 
a=0;//     .line 442
a=0;//     :cond_4
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     .line 445
a=0;//     :try_start_2
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 450
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 394
a=0;//     .end local v8    # "strReturn":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v8=(Conflicted);v10=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 395
a=0;//     .local v1, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 403
a=0;//     .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     .restart local v8    # "strReturn":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Integer);
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eq v9, v13, :cond_2
a=0;// 
a=0;//     .line 405
a=0;//     const-string v8, "\n"
a=0;// 
a=0;//     .line 406
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 416
a=0;//     :catch_1
a=0;//     #v9=(Integer);v10=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 417
a=0;//     .restart local v1    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 421
a=0;//     .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v9=(Integer);
a=0;//     invoke-virtual {v3, v6}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 423
a=0;//     add-int/lit8 v0, v0, 0x14
a=0;// 
a=0;//     .line 428
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 430
a=0;//     :cond_8
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     iget v11, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleWidth:F
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v9, v6, v10, v11, v12}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 432
a=0;//     .local v4, "nSize":I
a=0;//     #v4=(Integer);
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v0, v9
a=0;// 
a=0;//     .line 433
a=0;//     int-to-float v9, v0
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleHeight:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     cmpl-float v9, v9, v10
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_4
a=0;// 
a=0;//     .line 437
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v6, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 439
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 446
a=0;//     .end local v4    # "nSize":I
a=0;//     :catch_2
a=0;//     #v4=(Conflicted);v9=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 447
a=0;//     .restart local v1    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method protected pageUp()V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 460
a=0;//     #v13=(Null);
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gez v9, :cond_0
a=0;// 
a=0;//     .line 461
a=0;//     iput v13, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 463
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/util/Vector;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v2}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     .line 464
a=0;//     .local v2, "lines":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/Vector;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 465
a=0;//     .local v0, "curHeight":I
a=0;//     #v0=(Null);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     .line 468
a=0;//     .local v7, "strParagraph":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     int-to-float v9, v0
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleHeight:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     cmpg-float v9, v9, v10
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_1
a=0;// 
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gtz v9, :cond_2
a=0;// 
a=0;//     .line 507
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     int-to-float v9, v0
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleHeight:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     cmpl-float v9, v9, v10
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gtz v9, :cond_5
a=0;// 
a=0;//     .line 522
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     .line 523
a=0;//     return-void
a=0;// 
a=0;//     .line 470
a=0;//     :cond_2
a=0;//     #v3=(Uninit);
a=0;//     new-instance v6, Ljava/util/Vector;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v6}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     .line 471
a=0;//     .local v6, "paraLines":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
a=0;//     #v6=(Reference,Ljava/util/Vector;);
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     invoke-virtual {p0, v9}, Lcom/twocloo/com/cn/view/BookPageFactory;->readParagraphBack(I)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 472
a=0;//     .local v5, "paraBuf":[B
a=0;//     #v5=(Reference,[B);
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     array-length v10, v5
a=0;// 
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 475
a=0;//     add-int/lit8 v0, v0, 0xd
a=0;// 
a=0;//     .line 478
a=0;//     :try_start_0
a=0;//     new-instance v8, Ljava/lang/String;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v5, v9}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .end local v7    # "strParagraph":Ljava/lang/String;
a=0;//     .local v8, "strParagraph":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 484
a=0;//     .end local v8    # "strParagraph":Ljava/lang/String;
a=0;//     .restart local v7    # "strParagraph":Ljava/lang/String;
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     const-string v9, "\r\n"
a=0;// 
a=0;//     const-string v10, ""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v9, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 485
a=0;//     const-string v9, "\n"
a=0;// 
a=0;//     const-string v10, ""
a=0;// 
a=0;//     invoke-virtual {v7, v9, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 488
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 489
a=0;//     invoke-virtual {v6, v7}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 491
a=0;//     add-int/lit8 v0, v0, 0x14
a=0;// 
a=0;//     .line 495
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     if-gtz v9, :cond_4
a=0;// 
a=0;//     .line 503
a=0;//     invoke-virtual {v2, v13, v6}, Ljava/util/Vector;->addAll(ILjava/util/Collection;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 479
a=0;//     :catch_0
a=0;//     #v9=(Conflicted);v10=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 480
a=0;//     .local v1, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 497
a=0;//     .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v9=(Integer);v10=(Conflicted);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     iget v11, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleWidth:F
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v9, v7, v10, v11, v12}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 498
a=0;//     .local v4, "nSize":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v7, v13, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 499
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v0, v9
a=0;// 
a=0;//     .line 501
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 510
a=0;//     .end local v4    # "nSize":I
a=0;//     .end local v5    # "paraBuf":[B
a=0;//     .end local v6    # "paraLines":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Byte);v10=(Integer);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v2, v9}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 511
a=0;//     .local v3, "n":Ljava/lang/String;
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_strCharsetName:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v10}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iput v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 513
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     if-nez v9, :cond_6
a=0;// 
a=0;//     .line 514
a=0;//     add-int/lit8 v0, v0, -0x14
a=0;// 
a=0;//     .line 515
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 516
a=0;//     :cond_6
a=0;//     iget v9, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     sub-int/2addr v0, v9
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 518
a=0;//     .end local v3    # "n":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 519
a=0;//     .restart local v1    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public prePage()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 533
a=0;//     #v1=(Null);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     .line 535
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_isfirstPage:Z
a=0;// 
a=0;//     .line 546
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 538
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iput-boolean v1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_isfirstPage:Z
a=0;// 
a=0;//     .line 541
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 543
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageUp()V
a=0;// 
a=0;//     .line 545
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageDown()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected readParagraphBack(I)[B
a=0;//     .locals 8
a=0;//     .param p1, "nFromPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     move v4, p1
a=0;// 
a=0;//     .line 317
a=0;//     .local v4, "nEnd":I
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v6, v4, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 320
a=0;//     .local v2, "i":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v6=(Conflicted);
a=0;//     if-gtz v2, :cond_2
a=0;// 
a=0;//     .line 331
a=0;//     :goto_1
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 333
a=0;//     :cond_1
a=0;//     sub-int v5, v4, v2
a=0;// 
a=0;//     .line 335
a=0;//     .local v5, "nParaSize":I
a=0;//     #v5=(Integer);
a=0;//     new-array v1, v5, [B
a=0;// 
a=0;//     .line 336
a=0;//     .local v1, "buf":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "j":I
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     if-lt v3, v5, :cond_4
a=0;// 
a=0;//     .line 341
a=0;//     return-object v1
a=0;// 
a=0;//     .line 321
a=0;//     .end local v1    # "buf":[B
a=0;//     .end local v3    # "j":I
a=0;//     .end local v5    # "nParaSize":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/nio/MappedByteBuffer;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Ljava/nio/MappedByteBuffer;->get(I)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 323
a=0;//     .local v0, "b0":B
a=0;//     #v0=(Byte);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v0, v6, :cond_3
a=0;// 
a=0;//     add-int/lit8 v6, v4, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v2, v6, :cond_3
a=0;// 
a=0;//     .line 324
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 325
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 327
a=0;//     :cond_3
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     .end local v0    # "b0":B
a=0;//     .restart local v1    # "buf":[B
a=0;//     .restart local v3    # "j":I
a=0;//     .restart local v5    # "nParaSize":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Reference,[B);v3=(Integer);v5=(Integer);v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/nio/MappedByteBuffer;);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     add-int v7, v2, v3
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/nio/MappedByteBuffer;->get(I)B
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     aput-byte v6, v1, v3
a=0;// 
a=0;//     .line 336
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected readParagraphForward(I)[B
a=0;//     .locals 8
a=0;//     .param p1, "nFromPos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     move v5, p1
a=0;// 
a=0;//     .line 353
a=0;//     .local v5, "nStart":I
a=0;//     #v5=(Integer);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 357
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v6=(Conflicted);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v2, v6, :cond_0
a=0;// 
a=0;//     .line 363
a=0;//     :goto_1
a=0;//     sub-int v4, v2, v5
a=0;// 
a=0;//     .line 364
a=0;//     .local v4, "nParaSize":I
a=0;//     #v4=(Integer);
a=0;//     new-array v1, v4, [B
a=0;// 
a=0;//     .line 365
a=0;//     .local v1, "buf":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);
a=0;//     if-lt v2, v4, :cond_1
a=0;// 
a=0;//     .line 369
a=0;//     return-object v1
a=0;// 
a=0;//     .line 358
a=0;//     .end local v1    # "buf":[B
a=0;//     .end local v4    # "nParaSize":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v4=(Uninit);v7=(Uninit);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/nio/MappedByteBuffer;);
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     .end local v2    # "i":I
a=0;//     .local v3, "i":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v6, v2}, Ljava/nio/MappedByteBuffer;->get(I)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 359
a=0;//     .local v0, "b0":B
a=0;//     #v0=(Byte);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v0, v6, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 360
a=0;//     .end local v3    # "i":I
a=0;//     .restart local v2    # "i":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 366
a=0;//     .end local v0    # "b0":B
a=0;//     .restart local v1    # "buf":[B
a=0;//     .restart local v4    # "nParaSize":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,[B);v3=(Conflicted);v4=(Integer);v6=(Integer);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBuf:Ljava/nio/MappedByteBuffer;
a=0;// 
a=0;//     #v6=(Reference,Ljava/nio/MappedByteBuffer;);
a=0;//     add-int v7, p1, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/nio/MappedByteBuffer;->get(I)B
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     aput-byte v6, v1, v2
a=0;// 
a=0;//     .line 365
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v1    # "buf":[B
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "nParaSize":I
a=0;//     .restart local v0    # "b0":B
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);v3=(Integer);v4=(Uninit);v6=(PosByte);v7=(Uninit);
a=0;//     move v2, v3
a=0;// 
a=0;//     .end local v3    # "i":I
a=0;//     .restart local v2    # "i":I
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public resetHeight(I)V
a=0;//     .locals 1
a=0;//     .param p1, "h"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mHeight:I
a=0;// 
a=0;//     .line 846
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->marginHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     sub-int v0, p1, v0
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mVisibleHeight:F
a=0;// 
a=0;//     .line 847
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFontSize(I)V
a=0;//     .locals 1
a=0;//     .param p1, "fontsize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 741
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/view/BookPageFactory;->setFontSize2(I)V
a=0;// 
a=0;//     .line 742
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     invoke-virtual {v0}, Ljava/util/Vector;->clear()V
a=0;// 
a=0;//     .line 743
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     .line 745
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/view/BookPageFactory;->pageDown()Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_lines:Ljava/util/Vector;
a=0;// 
a=0;//     .line 746
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFontSize2(I)V
a=0;//     .locals 4
a=0;//     .param p1, "fontsize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 755
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 756
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->textSize:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V
a=0;// 
a=0;//     .line 757
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/DisplayUtil;->readTextFontSpaceSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 758
a=0;//     .local v0, "a":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 760
a=0;//     .local v1, "fm":Landroid/graphics/Paint$FontMetrics;
a=0;//     #v1=(Reference,Landroid/graphics/Paint$FontMetrics;);
a=0;//     iget v2, v1, Landroid/graphics/Paint$FontMetrics;->descent:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v1, Landroid/graphics/Paint$FontMetrics;->ascent:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->m_fontSize:I
a=0;// 
a=0;//     .line 761
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextColor(I)V
a=0;//     .locals 1
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 709
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 710
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->zPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 711
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->mainPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 712
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->linePaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 713
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "t"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 699
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/BookPageFactory;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 700
a=0;//     return-void
a=0;// .end method
}}
