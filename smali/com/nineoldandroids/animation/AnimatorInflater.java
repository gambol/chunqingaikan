package com.nineoldandroids.animation; class AnimatorInflater { void a() { int a;
a=0;// .class public Lcom/nineoldandroids/animation/AnimatorInflater;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AnimatorInflater.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final Animator:[I
a=0;// 
a=0;// .field private static final AnimatorSet:[I
a=0;// 
a=0;// .field private static final AnimatorSet_ordering:I = 0x0
a=0;// 
a=0;// .field private static final Animator_duration:I = 0x1
a=0;// 
a=0;// .field private static final Animator_interpolator:I = 0x0
a=0;// 
a=0;// .field private static final Animator_repeatCount:I = 0x3
a=0;// 
a=0;// .field private static final Animator_repeatMode:I = 0x4
a=0;// 
a=0;// .field private static final Animator_startOffset:I = 0x2
a=0;// 
a=0;// .field private static final Animator_valueFrom:I = 0x5
a=0;// 
a=0;// .field private static final Animator_valueTo:I = 0x6
a=0;// 
a=0;// .field private static final Animator_valueType:I = 0x7
a=0;// 
a=0;// .field private static final PropertyAnimator:[I
a=0;// 
a=0;// .field private static final PropertyAnimator_propertyName:I
a=0;// 
a=0;// .field private static final TOGETHER:I
a=0;// 
a=0;// .field private static final VALUE_TYPE_FLOAT:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v2=(Null);
a=0;//     new-array v0, v3, [I
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Reference,[I);
a=0;//     const v1, 0x10102e2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput v1, v0, v2
a=0;// 
a=0;//     .line 43
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/AnimatorInflater;->AnimatorSet:[I
a=0;// 
a=0;//     .line 48
a=0;//     new-array v0, v3, [I
a=0;// 
a=0;//     .line 49
a=0;//     const v1, 0x10102e1
a=0;// 
a=0;//     aput v1, v0, v2
a=0;// 
a=0;//     .line 48
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/AnimatorInflater;->PropertyAnimator:[I
a=0;// 
a=0;//     .line 53
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/AnimatorInflater;->Animator:[I
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1010141
a=0;//         0x1010198
a=0;//         0x10101be
a=0;//         0x10101bf
a=0;//         0x10101c0
a=0;//         0x10102de
a=0;//         0x10102df
a=0;//         0x10102e0
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/AnimatorInflater;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static createAnimatorFromXml(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Lcom/nineoldandroids/animation/Animator;
a=0;//     .locals 3
a=0;//     .param p0, "c"    # Landroid/content/Context;
a=0;//     .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xmlpull/v1/XmlPullParserException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/AttributeSet;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, p1, v0, v1, v2}, Lcom/nineoldandroids/animation/AnimatorInflater;->createAnimatorFromXml(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Lcom/nineoldandroids/animation/AnimatorSet;I)Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static createAnimatorFromXml(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Lcom/nineoldandroids/animation/AnimatorSet;I)Lcom/nineoldandroids/animation/Animator;
a=0;//     .locals 17
a=0;//     .param p0, "c"    # Landroid/content/Context;
a=0;//     .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "parent"    # Lcom/nineoldandroids/animation/AnimatorSet;
a=0;//     .param p4, "sequenceOrdering"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xmlpull/v1/XmlPullParserException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     .local v4, "anim":Lcom/nineoldandroids/animation/Animator;
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     .local v6, "childAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     #v6=(Null);
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 135
a=0;//     .local v7, "depth":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ujava/lang/Object;);v6=(Reference,Ljava/util/ArrayList;);v7=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .local v13, "type":I
a=0;//     #v13=(Integer);
a=0;//     const/4 v14, 0x3
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-ne v13, v14, :cond_1
a=0;// 
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-le v14, v7, :cond_2
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     if-ne v13, v14, :cond_4
a=0;// 
a=0;//     .line 170
a=0;//     :cond_2
a=0;//     #v14=(Integer);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     new-array v5, v14, [Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 172
a=0;//     .local v5, "animsArray":[Lcom/nineoldandroids/animation/Animator;
a=0;//     #v5=(Reference,[Lcom/nineoldandroids/animation/Animator;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     .local v8, "index":I
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     :goto_1
a=0;//     #v8=(Integer);v9=(Conflicted);v14=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_a
a=0;// 
a=0;//     .line 176
a=0;//     if-nez p4, :cond_b
a=0;// 
a=0;//     .line 177
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-virtual {v0, v5}, Lcom/nineoldandroids/animation/AnimatorSet;->playTogether([Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 183
a=0;//     .end local v5    # "animsArray":[Lcom/nineoldandroids/animation/Animator;
a=0;//     .end local v8    # "index":I
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 138
a=0;//     :cond_4
a=0;//     #v5=(Uninit);v8=(Uninit);v9=(Uninit);v14=(One);
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-ne v13, v14, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 144
a=0;//     .local v10, "name":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v14, "objectAnimator"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_6
a=0;// 
a=0;//     .line 145
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/AttributeSet;);
a=0;//     invoke-static {v0, v1}, Lcom/nineoldandroids/animation/AnimatorInflater;->loadObjectAnimator(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 163
a=0;//     :goto_3
a=0;//     #v14=(Conflicted);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v6    # "childAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 167
a=0;//     .restart local v6    # "childAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     :cond_5
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v14=(Boolean);
a=0;//     const-string v14, "animator"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_7
a=0;// 
a=0;//     .line 147
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/AttributeSet;);
a=0;//     invoke-static {v0, v1, v14}, Lcom/nineoldandroids/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/nineoldandroids/animation/ValueAnimator;)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 148
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v14=(Boolean);
a=0;//     const-string v14, "set"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_9
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v4, Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     .end local v4    # "anim":Lcom/nineoldandroids/animation/Animator;
a=0;//     #v4=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v4}, Lcom/nineoldandroids/animation/AnimatorSet;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     .restart local v4    # "anim":Lcom/nineoldandroids/animation/Animator;
a=0;//     #v4=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     sget-object v14, Lcom/nineoldandroids/animation/AnimatorInflater;->AnimatorSet:[I
a=0;// 
a=0;//     .line 150
a=0;//     #v14=(Reference,[I);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/AttributeSet;);
a=0;//     invoke-virtual {v0, v1, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 153
a=0;//     .local v3, "a":Landroid/content/res/TypedArray;
a=0;//     #v3=(Reference,Landroid/content/res/TypedArray;);
a=0;//     new-instance v12, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 154
a=0;//     .local v12, "orderingValue":Landroid/util/TypedValue;
a=0;//     #v12=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v3, v14, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 155
a=0;//     iget v14, v12, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     const/16 v15, 0x10
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     if-ne v14, v15, :cond_8
a=0;// 
a=0;//     iget v11, v12, Landroid/util/TypedValue;->data:I
a=0;// 
a=0;//     .local v11, "ordering":I
a=0;//     :goto_4
a=0;//     #v11=(Integer);
a=0;//     move-object v14, v4
a=0;// 
a=0;//     .line 157
a=0;//     #v14=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     check-cast v14, Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/AttributeSet;);
a=0;//     invoke-static {v0, v1, v2, v14, v11}, Lcom/nineoldandroids/animation/AnimatorInflater;->createAnimatorFromXml(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Lcom/nineoldandroids/animation/AnimatorSet;I)Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 155
a=0;//     .end local v11    # "ordering":I
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v11=(Conflicted);v14=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 160
a=0;//     .end local v3    # "a":Landroid/content/res/TypedArray;
a=0;//     .end local v12    # "orderingValue":Landroid/util/TypedValue;
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Boolean);v15=(Conflicted);
a=0;//     new-instance v14, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Unknown animator name: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 173
a=0;//     .end local v10    # "name":Ljava/lang/String;
a=0;//     .restart local v5    # "animsArray":[Lcom/nineoldandroids/animation/Animator;
a=0;//     .restart local v8    # "index":I
a=0;//     :cond_a
a=0;//     #v5=(Reference,[Lcom/nineoldandroids/animation/Animator;);v8=(Integer);v9=(Conflicted);v10=(Conflicted);v15=(Boolean);v16=(Uninit);
a=0;//     invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 174
a=0;//     .local v3, "a":Lcom/nineoldandroids/animation/Animator;
a=0;//     add-int/lit8 v9, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "index":I
a=0;//     .local v9, "index":I
a=0;//     #v9=(Integer);
a=0;//     aput-object v3, v5, v8
a=0;// 
a=0;//     move v8, v9
a=0;// 
a=0;//     .end local v9    # "index":I
a=0;//     .restart local v8    # "index":I
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 179
a=0;//     .end local v3    # "a":Lcom/nineoldandroids/animation/Animator;
a=0;//     :cond_b
a=0;//     #v3=(Conflicted);v9=(Conflicted);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-virtual {v0, v5}, Lcom/nineoldandroids/animation/AnimatorSet;->playSequentially([Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static loadAnimator(Landroid/content/Context;I)Lcom/nineoldandroids/animation/Animator;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "id"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/content/res/Resources$NotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     .local v1, "parser":Landroid/content/res/XmlResourceParser;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 100
a=0;//     #v1=(Reference,Landroid/content/res/XmlResourceParser;);
a=0;//     invoke-static {p0, v1}, Lcom/nineoldandroids/animation/AnimatorInflater;->createAnimatorFromXml(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Lcom/nineoldandroids/animation/Animator;
a=0;//     :try_end_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 114
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     return-object v3
a=0;// 
a=0;//     .line 101
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "ex":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     new-instance v2, Landroid/content/res/Resources$NotFoundException;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/res/Resources$NotFoundException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Can\'t load animation resource ID #0x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 103
a=0;//     invoke-direct {v2, v3}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 105
a=0;//     .local v2, "rnf":Landroid/content/res/Resources$NotFoundException;
a=0;//     #v2=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 106
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 113
a=0;//     .end local v0    # "ex":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     .end local v2    # "rnf":Landroid/content/res/Resources$NotFoundException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 114
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     throw v3
a=0;// 
a=0;//     .line 107
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "ex":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v2, Landroid/content/res/Resources$NotFoundException;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/res/Resources$NotFoundException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Can\'t load animation resource ID #0x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 109
a=0;//     invoke-direct {v2, v3}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     .restart local v2    # "rnf":Landroid/content/res/Resources$NotFoundException;
a=0;//     #v2=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 112
a=0;//     throw v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method private static loadAnimator(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/nineoldandroids/animation/ValueAnimator;)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .locals 23
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p2, "anim"    # Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/content/res/Resources$NotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     sget-object v21, Lcom/nineoldandroids/animation/AnimatorInflater;->Animator:[I
a=0;// 
a=0;//     #v21=(Reference,[I);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/AttributeSet;);
a=0;//     move-object/from16 v2, v21
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 219
a=0;//     .local v3, "a":Landroid/content/res/TypedArray;
a=0;//     #v3=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     .line 221
a=0;//     .local v4, "duration":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v11, v0
a=0;// 
a=0;//     .line 223
a=0;//     .local v11, "startDelay":J
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const/16 v21, 0x7
a=0;// 
a=0;//     .line 224
a=0;//     #v21=(PosByte);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .line 223
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 226
a=0;//     .local v20, "valueType":I
a=0;//     #v20=(Integer);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 227
a=0;//     new-instance p2, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .end local p2    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     #p2=(UninitRef,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     invoke-direct/range {p2 .. p2}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 231
a=0;//     .restart local p2    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     :cond_0
a=0;//     #p2=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     const/16 v17, 0x5
a=0;// 
a=0;//     .line 232
a=0;//     .local v17, "valueFromIndex":I
a=0;//     #v17=(PosByte);
a=0;//     const/16 v19, 0x6
a=0;// 
a=0;//     .line 234
a=0;//     .local v19, "valueToIndex":I
a=0;//     #v19=(PosByte);
a=0;//     if-nez v20, :cond_8
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 236
a=0;//     .local v7, "getFloats":Z
a=0;//     :goto_0
a=0;//     #v7=(Boolean);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 237
a=0;//     .local v14, "tvFrom":Landroid/util/TypedValue;
a=0;//     #v14=(Reference,Landroid/util/TypedValue;);
a=0;//     if-eqz v14, :cond_9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 238
a=0;//     .local v8, "hasFrom":Z
a=0;//     :goto_1
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_a
a=0;// 
a=0;//     iget v6, v14, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     .line 239
a=0;//     .local v6, "fromType":I
a=0;//     :goto_2
a=0;//     #v6=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 240
a=0;//     .local v15, "tvTo":Landroid/util/TypedValue;
a=0;//     #v15=(Reference,Landroid/util/TypedValue;);
a=0;//     if-eqz v15, :cond_b
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 241
a=0;//     .local v9, "hasTo":Z
a=0;//     :goto_3
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_c
a=0;// 
a=0;//     iget v13, v15, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     .line 243
a=0;//     .local v13, "toType":I
a=0;//     :goto_4
a=0;//     #v13=(Integer);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     const/16 v21, 0x1c
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-lt v6, v0, :cond_1
a=0;// 
a=0;//     .line 244
a=0;//     const/16 v21, 0x1f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-le v6, v0, :cond_2
a=0;// 
a=0;//     .line 245
a=0;//     :cond_1
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     const/16 v21, 0x1c
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-lt v13, v0, :cond_3
a=0;// 
a=0;//     .line 246
a=0;//     const/16 v21, 0x1f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-gt v13, v0, :cond_3
a=0;// 
a=0;//     .line 248
a=0;//     :cond_2
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 249
a=0;//     #v7=(Null);
a=0;//     new-instance v21, Lcom/nineoldandroids/animation/ArgbEvaluator;
a=0;// 
a=0;//     #v21=(UninitRef,Lcom/nineoldandroids/animation/ArgbEvaluator;);
a=0;//     invoke-direct/range {v21 .. v21}, Lcom/nineoldandroids/animation/ArgbEvaluator;-><init>()V
a=0;// 
a=0;//     #v21=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 252
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v7=(Boolean);v21=(Conflicted);
a=0;//     if-eqz v7, :cond_12
a=0;// 
a=0;//     .line 255
a=0;//     if-eqz v8, :cond_10
a=0;// 
a=0;//     .line 256
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v6, v0, :cond_d
a=0;// 
a=0;//     .line 257
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 261
a=0;//     .local v16, "valueFrom":F
a=0;//     :goto_5
a=0;//     #v16=(Float);
a=0;//     if-eqz v9, :cond_f
a=0;// 
a=0;//     .line 262
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-ne v13, v0, :cond_e
a=0;// 
a=0;//     .line 263
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 267
a=0;//     .local v18, "valueTo":F
a=0;//     :goto_6
a=0;//     #v18=(Float);
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[F);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     aput v16, v21, v22
a=0;// 
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     #v22=(One);
a=0;//     aput v18, v21, v22
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 319
a=0;//     .end local v16    # "valueFrom":F
a=0;//     .end local v18    # "valueTo":F
a=0;//     :cond_4
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v16=(Conflicted);v18=(Conflicted);v21=(Conflicted);v22=(Boolean);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 320
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v11, v12}, Lcom/nineoldandroids/animation/ValueAnimator;->setStartDelay(J)V
a=0;// 
a=0;//     .line 322
a=0;//     const/16 v21, 0x3
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-eqz v21, :cond_5
a=0;// 
a=0;//     .line 324
a=0;//     const/16 v21, 0x3
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 323
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setRepeatCount(I)V
a=0;// 
a=0;//     .line 326
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v22=(Boolean);
a=0;//     const/16 v21, 0x4
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-eqz v21, :cond_6
a=0;// 
a=0;//     .line 328
a=0;//     const/16 v21, 0x4
a=0;// 
a=0;//     .line 329
a=0;//     #v21=(PosByte);
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     .line 328
a=0;//     #v22=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 327
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setRepeatMode(I)V
a=0;// 
a=0;//     .line 336
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v22=(Boolean);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 337
a=0;//     .local v10, "resID":I
a=0;//     #v10=(Integer);
a=0;//     if-lez v10, :cond_7
a=0;// 
a=0;//     .line 338
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, v10}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     #v21=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 340
a=0;//     :cond_7
a=0;//     invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 342
a=0;//     return-object p2
a=0;// 
a=0;//     .line 234
a=0;//     .end local v6    # "fromType":I
a=0;//     .end local v7    # "getFloats":Z
a=0;//     .end local v8    # "hasFrom":Z
a=0;//     .end local v9    # "hasTo":Z
a=0;//     .end local v10    # "resID":I
a=0;//     .end local v13    # "toType":I
a=0;//     .end local v14    # "tvFrom":Landroid/util/TypedValue;
a=0;//     .end local v15    # "tvTo":Landroid/util/TypedValue;
a=0;//     :cond_8
a=0;//     #v0=(PosByte);v1=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v21=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     .restart local v7    # "getFloats":Z
a=0;//     .restart local v14    # "tvFrom":Landroid/util/TypedValue;
a=0;//     :cond_9
a=0;//     #v7=(Boolean);v14=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 238
a=0;//     .restart local v8    # "hasFrom":Z
a=0;//     :cond_a
a=0;//     #v8=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 240
a=0;//     .restart local v6    # "fromType":I
a=0;//     .restart local v15    # "tvTo":Landroid/util/TypedValue;
a=0;//     :cond_b
a=0;//     #v6=(Integer);v15=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 241
a=0;//     .restart local v9    # "hasTo":Z
a=0;//     :cond_c
a=0;//     #v9=(Boolean);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 259
a=0;//     .restart local v13    # "toType":I
a=0;//     :cond_d
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);v13=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .restart local v16    # "valueFrom":F
a=0;//     #v16=(Float);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 265
a=0;//     :cond_e
a=0;//     #v21=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .restart local v18    # "valueTo":F
a=0;//     #v18=(Float);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 269
a=0;//     .end local v18    # "valueTo":F
a=0;//     :cond_f
a=0;//     #v18=(Uninit);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[F);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     aput v16, v21, v22
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 272
a=0;//     .end local v16    # "valueFrom":F
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v16=(Uninit);v21=(Conflicted);
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v13, v0, :cond_11
a=0;// 
a=0;//     .line 273
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 277
a=0;//     .restart local v18    # "valueTo":F
a=0;//     :goto_8
a=0;//     #v18=(Float);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[F);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     aput v18, v21, v22
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 275
a=0;//     .end local v18    # "valueTo":F
a=0;//     :cond_11
a=0;//     #v0=(PosByte);v18=(Uninit);v21=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .restart local v18    # "valueTo":F
a=0;//     #v18=(Float);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 282
a=0;//     .end local v18    # "valueTo":F
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);v18=(Uninit);v21=(Conflicted);
a=0;//     if-eqz v8, :cond_18
a=0;// 
a=0;//     .line 283
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v6, v0, :cond_13
a=0;// 
a=0;//     .line 284
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Float);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 291
a=0;//     .local v16, "valueFrom":I
a=0;//     :goto_9
a=0;//     #v16=(Integer);
a=0;//     if-eqz v9, :cond_17
a=0;// 
a=0;//     .line 292
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v13, v0, :cond_15
a=0;// 
a=0;//     .line 293
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Float);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     .line 300
a=0;//     .local v18, "valueTo":I
a=0;//     :goto_a
a=0;//     #v18=(Integer);
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[I);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     aput v16, v21, v22
a=0;// 
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     #v22=(One);
a=0;//     aput v18, v21, v22
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 285
a=0;//     .end local v16    # "valueFrom":I
a=0;//     .end local v18    # "valueTo":I
a=0;//     :cond_13
a=0;//     #v0=(PosByte);v16=(Uninit);v18=(Uninit);v21=(PosByte);v22=(Null);
a=0;//     const/16 v21, 0x1c
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-lt v6, v0, :cond_14
a=0;// 
a=0;//     .line 286
a=0;//     const/16 v21, 0x1f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-gt v6, v0, :cond_14
a=0;// 
a=0;//     .line 287
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 288
a=0;//     .restart local v16    # "valueFrom":I
a=0;//     #v16=(Integer);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 289
a=0;//     .end local v16    # "valueFrom":I
a=0;//     :cond_14
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);v16=(Uninit);v21=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .restart local v16    # "valueFrom":I
a=0;//     #v16=(Integer);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 294
a=0;//     :cond_15
a=0;//     #v21=(PosByte);
a=0;//     const/16 v21, 0x1c
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-lt v13, v0, :cond_16
a=0;// 
a=0;//     .line 295
a=0;//     const/16 v21, 0x1f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-gt v13, v0, :cond_16
a=0;// 
a=0;//     .line 296
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 297
a=0;//     .restart local v18    # "valueTo":I
a=0;//     #v18=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 298
a=0;//     .end local v18    # "valueTo":I
a=0;//     :cond_16
a=0;//     #v18=(Uninit);v21=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .restart local v18    # "valueTo":I
a=0;//     #v18=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 302
a=0;//     .end local v18    # "valueTo":I
a=0;//     :cond_17
a=0;//     #v0=(Integer);v18=(Uninit);v21=(Float);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[I);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     aput v16, v21, v22
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 305
a=0;//     .end local v16    # "valueFrom":I
a=0;//     :cond_18
a=0;//     #v0=(Conflicted);v16=(Uninit);v21=(Conflicted);
a=0;//     if-eqz v9, :cond_4
a=0;// 
a=0;//     .line 306
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v13, v0, :cond_19
a=0;// 
a=0;//     .line 307
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Float);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     .line 314
a=0;//     .restart local v18    # "valueTo":I
a=0;//     :goto_b
a=0;//     #v18=(Integer);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[I);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     aput v18, v21, v22
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 308
a=0;//     .end local v18    # "valueTo":I
a=0;//     :cond_19
a=0;//     #v0=(PosByte);v18=(Uninit);v21=(PosByte);
a=0;//     const/16 v21, 0x1c
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-lt v13, v0, :cond_1a
a=0;// 
a=0;//     .line 309
a=0;//     const/16 v21, 0x1f
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-gt v13, v0, :cond_1a
a=0;// 
a=0;//     .line 310
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 311
a=0;//     .restart local v18    # "valueTo":I
a=0;//     #v18=(Integer);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 312
a=0;//     .end local v18    # "valueTo":I
a=0;//     :cond_1a
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/ArgbEvaluator;);v18=(Uninit);v21=(PosByte);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .restart local v18    # "valueTo":I
a=0;//     #v18=(Integer);
a=0;//     goto :goto_b
a=0;// .end method
a=0;// 
a=0;// .method private static loadObjectAnimator(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/content/res/Resources$NotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>()V
a=0;// 
a=0;//     .line 192
a=0;//     .local v1, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-static {p0, p1, v1}, Lcom/nineoldandroids/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/nineoldandroids/animation/ValueAnimator;)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 195
a=0;//     sget-object v3, Lcom/nineoldandroids/animation/AnimatorInflater;->PropertyAnimator:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {p0, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 197
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 199
a=0;//     .local v2, "propertyName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 203
a=0;//     return-object v1
a=0;// .end method
}}
